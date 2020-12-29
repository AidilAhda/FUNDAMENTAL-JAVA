import java.util.Scanner;
class HitungAngkaGanjilPart2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int kiri = input.nextInt();
    int kanan = input.nextInt();
    int matrix[][] = new int [kiri][kanan];
    
    for (int i = 0;i < kiri;i++){
      for(int j = 0; j < kanan; j++){
        matrix[i][j] = input.nextInt();     
          }
    }
    int ganjil = 0;
    for (int i = 0;i < kiri; i++){
      for(int j = 0;j < kanan;j++){
        if(matrix[i][j] %2 != 0){
          ganjil ++;
        }
      }
      System.out.println(ganjil);
    ganjil = 0;
    }
    
  }
}