import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int size;
        int[] numArr;
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("size not exceed 20");
            }
        } while (size > 20);
        numArr = new int[size];
        int i = 0;
        while (i < numArr.length) {
            System.out.println("ELement " + (i + 1) + ": ");
            numArr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Original Arr: ");
        for (int j = 0; j < numArr.length; j++) {
            System.out.print(numArr[j] + "\t");
        }
        int max = numArr[0];
        for (int j = 1; j < numArr.length; j++) {
            if (numArr[j] > max) {
                max = numArr[j];
            }
        }
        System.out.println("Max of array is: " + max);
    }
}
