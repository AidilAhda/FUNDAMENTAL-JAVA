import java.util.Scanner;
class LabelTanggal {
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
    int tanggal = input.nextInt();
    int bulan = input.nextInt();
    int tahun = input.nextInt();
    System.out.println(tanggal + " " + namaBulan[bulan-1] + " " + tahun);
  }
}