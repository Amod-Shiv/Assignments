import java.util.Scanner;

public class Q2_totaloccurrences {
    static void numOccurrences(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==x){
               count++;
            }   
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to check: ");
        int x = sc.nextInt();

        numOccurrences(arr,x);
        sc.close();
    }
}
