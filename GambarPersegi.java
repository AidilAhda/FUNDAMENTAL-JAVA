import java.util.Scanner;
class GambarPersegi{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    
    int i,j;
    for(i = 1;i <= a;i++){
      for(j = 1;j <= a;j++){
        System.out.print("*");
      }
      System.out.println( );
    }
    
  }
}