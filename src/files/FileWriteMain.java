package files;


import java.io.*;
import java.util.Scanner;

public class FileWriteMain {
    public static void main(String[] args) {

    }

    public  void appendData(String data) {
        try{
            File myFile = new File("text.txt");
            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.print(data);
            printWriter.println("More Money More Problems");
            printWriter.println("No Money Less Problems");

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public void writeData(String data){
        try{
        File myFile = new File("test.txt");
        FileWriter writeToFile = new FileWriter(myFile);

        writeToFile.write(data);
        writeToFile.append("More Text");

        writeToFile.flush();
        writeToFile.close();

    }  catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("Can not write to this file");
        }

    }

    public  void readFromFile() {
        try{
            File myFile = new File("test.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNext()){
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);

            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
            System.out.println("File not found");
        }



    }
}


