import java.util.Scanner;
public class AddingUpIntegers {
    public static void main(String[] args) {
        Scanner amount = new Scanner(System.in);
        System.out.println("How many integers will be addded");
        int ding = amount.nextInt();
        int sum = 0;

        for(int i=1; i <= ding; i=i+1 ){
            
            System.out.println("Enter an intger");
            int ligma = amount.nextInt();
            sum = sum + ligma;

    }
        System.out.println("The sum is: " +sum);
}
}