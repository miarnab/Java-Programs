import java.io.*;
public class linearsearchcount {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the numbner of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        int i,count=0;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the element to search: ");
        int s=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            if(s==ar[i]){
                count++;
            }
        }
        System.out.println("Number of occurence of the digit in the array: "+count);
    }
}
