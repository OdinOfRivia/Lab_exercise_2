import java.util.Scanner;

public class SumOfSequentialIntegers {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the N");
        int Number = s.nextInt();
        int sum=0;

        for(int i=0; i<= Number; i=i+1  ){
            sum = sum + i;

            }
        System.out.print("The sum of 1 to " + Number + " is " + sum );



}}
