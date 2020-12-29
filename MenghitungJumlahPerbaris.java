import java.util.Scanner;
class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int [][] angka = new int [5][5];
 
    for (int i = 0;i < 5 ; i++){
      for (int j = 0;j <5;j++){
 angka[i][j] = input.nextInt();
        
      }
      
        }
    int sum = 0;
         for(int i = 0;i<5;i++){
       for(int j = 0;j<5;j++){
        sum = sum + angka[i][j];
       
      }
      System.out.println(sum);
    sum = 0;
         
  }
}
}