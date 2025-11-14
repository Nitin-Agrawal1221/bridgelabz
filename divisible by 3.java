import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        int count = 0;

        for(int i = start; i <= end; i++){
            if(i % 3 == 0){
                count++;
            }
        }

        System.out.println("Count of numbers divisible by 3 = " + count);
    }
}
