import java.util.Scanner;

class CetakNamadanUmur{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      String Nama = input.nextLine();
      

      int Tahun = input.nextInt();
      int umur = 2020 - Tahun;
      

  System.out.printf("%s (%d tahun)" ,Nama,umur );
       
    }
}