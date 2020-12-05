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

        boolean sorted = false;
        int temp;
        int lengthNum = String.valueOf(arr[0]).length();
        while (!sorted){
            sorted = true;
            for (int i = 0;i < arr.length-1; i++){
                lengthNum += String.valueOf(arr[i+1]).length();
                if (String.valueOf(arr[i]).length() > String.valueOf(arr[i+1]).length()){

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        double srednee = (double)lengthNum / (double)number;
        System.out.println("Srednee chislo = " + srednee);

        for (int i=0; i < arr.length; i++){
            if (String.valueOf(arr[i]).length() <= srednee){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
