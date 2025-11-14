import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        System.out.println("Numbers divisible by both 3 and 5:");

        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
