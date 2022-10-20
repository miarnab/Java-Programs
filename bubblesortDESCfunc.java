import java.io.*;
public class bubblesortDESCfunc {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the nunber of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        int i,j;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        for(j=0;j<n;j++){
            int res = bubblesort(n);
            System.out.println(arr[j]);
        }
    }
    int bubblesort(int n){

    }
}
