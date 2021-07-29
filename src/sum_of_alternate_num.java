import java.util.Scanner;

public class sum_of_alternate_num {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scanner.nextInt();
        System.out.println("Enter the element of array");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            if (i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of alternate number = " +sum);

    }
}
