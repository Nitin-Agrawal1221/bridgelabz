import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        System.out.println("Even numbers are:");

        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
