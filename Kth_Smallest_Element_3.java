import java.util.Arrays;
import java.util.Scanner;

public class Kth_Smallest_Element_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                if (arr[i] > arr[j])
//                {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
