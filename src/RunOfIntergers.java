import java.util.Scanner;

public class RunOfIntergers {
    public static void main(String[] args) throws Exception {

        Scanner startInput = new Scanner(System.in);
       
        System.out.println("Input the start: ");
       int x = startInput.nextInt();
       System.out.println("Input the end: ");
        int y = startInput.nextInt();

        for(int i = x; i <=y; i++){
            System.out.println(i);
        }     
    }
    
}

