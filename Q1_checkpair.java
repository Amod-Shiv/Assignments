import java.util.Scanner;

public class Q1_checkpair {
    
    static void checking(int[] arr, int x){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1;j<n; j++){
                if(arr[i]-arr[j]==x || arr[i]-arr[j]==-x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
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

        System.out.println("Enter required difference: ");
        int x = sc.nextInt();
        
        checking(arr,x);
        sc.close();

    }
}
