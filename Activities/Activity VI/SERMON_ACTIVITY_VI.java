import java.util.Scanner;
public class SERMON_ACTIVITY_VI {
    public static void main(String []args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Time: ");
      int time = sc.nextInt();

      while(time >=0){
        System.out.println(time);
        time --;
     }
    }
}