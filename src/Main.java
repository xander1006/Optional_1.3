import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Vvedite kol-vo chisel ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Vvedite chisla:");
        int[] arr = new int[number];
        int j = 0;
        while (j < number){
            arr[j] = scan.nextInt();
            j++;
        }



    }
}
