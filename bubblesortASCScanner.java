import java.util.*;
public class bubblesortASCScanner {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i,j;
        System.out.println("Enter the elements inside the array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                
                }
            }
        }
    }    
}
