import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class reverse_matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number the row and column");
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println("Enter the element of array");
        int arr[][]=new int[m][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Print reverse matrix ");
        for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
