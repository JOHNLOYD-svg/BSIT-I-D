import java.util.Scanner;

public class GUTIB_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.print("Enter your temperature: ");
        temp = input.nextInt();
        if (temp >= 100) {
            System.out.println("Boioling");

        } else {
            System.out.println("Not Boiling");

        }

    }

}
