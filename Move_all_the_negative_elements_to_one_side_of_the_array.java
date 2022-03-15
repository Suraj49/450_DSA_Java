import java.util.Arrays;
import java.util.Scanner;

public class Move_all_the_negative_elements_to_one_side_of_the_array {

    public static void segregateElements(int arr[], int n)
    {
        int res[]=new int[n];
        int pos=0,neg=n-1;
        for(int i:arr) //for +ve elements
            if(i>=0)
            {
                res[pos]=i;
                pos++;
            }

        for(int i=n-1;i>=0;i--)//for -ve elements
            if(arr[i]<0)
            {
                res[neg]=arr[i];
                neg--;
            }


        for(int i=0;i<n;i++)//copying array
            arr[i]=res[i];


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int s=0;s<n;s++){
            arr[s]=sc.nextInt();
        }
//
        segregateElements(arr,n);

        for (int l=0;l<n;l++){
            System.out.print(arr[l]+"\t");
        }
    }
}
