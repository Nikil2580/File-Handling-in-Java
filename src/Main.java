import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("D:\\Files\\VS Code\\Java Project\\src\\NewFile.txt"));
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            FileWriter write = new FileWriter(new File("D:\\Files\\VS Code\\Java Project\\src\\NewFile.txt"));
            write.write("This is inserted from java file");
            write.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }
}