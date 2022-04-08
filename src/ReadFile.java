import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        int a = 0;
       try {
           BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
           String line;

           while ((line=reader.readLine()) !=null){
               System.out.println(line);
               a = a+1;
           }
           reader.close();
       }catch (Exception e){
           e.printStackTrace();
       }
        System.out.println(a);
       ListAllFiles ls = new ListAllFiles();
       ls.listFileName();
    }
}
