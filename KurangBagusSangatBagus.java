import java.util.Scanner;   //class Scanner
class KurangBagusSangatBagus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   //penggunaan class Scanner
    int nilai = input.nextInt();
    
    // penggunaan if,else if,else
    if(nilai > 75) {
      System.out.println("Sangat Bagus");
    } else if (nilai < 55) {
      System.out.println("Kurang");
    } else {
      System.out.println("Bagus");
    }
    
  }
}