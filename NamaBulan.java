import java.util.Scanner;
class NamaBulan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String[] namaBulan = {
        "Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember",
    };
      
      int bulan = input.nextInt();
      int Januari = 0;
      if (bulan > 0 && bulan <=12){

     System.out.print(namaBulan[bulan-1]);
    
  } else {
    System.out.println("Nomor tidak valid");
    }
  }
}