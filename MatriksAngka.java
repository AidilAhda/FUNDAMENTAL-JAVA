import java.util.Scanner;
class MatriksAngka {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i,j;
    int a = input.nextInt();
    
    for (i = 0;i < a;i++){
      for(j = 0;j < a;j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
  }
}