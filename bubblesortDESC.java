import java.io.*;
public class bubblesortDESC{
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        int i,j,temp=0;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        for(i=1;i<n;i++){
            for(j=1;j<n-i;j++){
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