import java.util.Scanner;

public class Q3_missingnumber {

    static int[] sortArray(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    static void findMissingNumber(int[] arr){
        int[] ans=sortArray(arr);
        for(int i=0; i<ans.length; i++){
            if(arr[i]!=i+1){
                System.out.print("Missing no. = ");
                System.out.println(i+1);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        int n = sc.nextInt();
        
        int[] arr = new int[n-1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }

        findMissingNumber(arr);
        sc.close();
    }
}
