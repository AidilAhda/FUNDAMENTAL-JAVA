import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bacaisidarifile{
    public static void main(String[] args) {
      
      try {
        Path file = Paths.get("src/data.txt");
                      byte[] data = 
        Files.readAllBytes(file);
        String isi = new String(data);
        
        System.out.println(isi);
      }catch (IOException Exception) {
        
        System.out.println("Selamat, kamu berhasil membaca data dari file");
      }


       
    }
}