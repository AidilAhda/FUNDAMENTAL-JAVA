import java.util.Scanner;
class ArrayTerbalik2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    
    int[] arrayIn = new int[a];
    
    for(int i = 0;i < a;i++){
      arrayIn[i] = input.nextInt();
      
    }
  for(int j = a-1;j >= 0;j--){
    System.out.print(arrayIn[j] + " ");
    
    }
  }
}