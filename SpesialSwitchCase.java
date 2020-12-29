import java.util.Scanner;
class SpesialSwitchCase{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan = input.nextInt();
    switch(pilihan){
            case 1 :
            System.out.println("Satu");
             System.out.println("Dua");
              System.out.println("Tiga");
                  break;
            
            case 2 :
              System.out.println("Dua");
              System.out.println("Tiga");
                  break;
          
            case 3 :
      
      System.out.println("Tiga");
                  break;
                  
            default:
            System.out.println("no paket");
                  
      
    }
    
    }
}