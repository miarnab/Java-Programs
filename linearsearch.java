import java.io.*;
public class linearsearch {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        int ar[]=new int[n];
        int i,p=0;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<n;i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number to search in the array: ");
        int a=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            if(a==ar[i]){
                p=i;
            }
        }
        System.out.printf("The number %d is found in position %d",a,p);
    }
}
