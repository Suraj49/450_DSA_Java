import java.util.Scanner;

public class ReverseanArray_1 {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a){
        int i=0;
        int j=a.length-1;
        while (i<=j){
            swap(a,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int s=a[i];
        a[i]=a[j];
        a[j]=s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        display(arr);
    }
}
