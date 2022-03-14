import java.util.Scanner;

public class SortArrayhave3Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0] > arr[1]){
                   int temp = arr[0];
                   arr[0] = arr[1];
                   arr[1] = temp;
        }
         if(arr[0]>arr[2]){
            int temp = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;
        }
        if(arr[1]>arr[2]){
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        for (int j=0;j<3;j++){
            System.out.println(arr[j]);
        }
    }
}
