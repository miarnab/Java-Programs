import java.util.*;
public class bubblesortDESCScanner {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int i,j,temp=0;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                if(ar[j-1]<ar[j]){
                    temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        //display
        for(i=0;i<n;i++){
            System.out.println(ar[i]);
        }
    }
}
