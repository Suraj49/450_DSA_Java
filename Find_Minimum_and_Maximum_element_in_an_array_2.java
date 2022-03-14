import java.util.Scanner;

public class Find_Minimum_and_Maximum_element_in_an_array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int j=0;j<n;j++){
            if(max<arr[j]){
                max=arr[j];
            }
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
