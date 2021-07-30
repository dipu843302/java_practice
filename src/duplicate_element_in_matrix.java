import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class duplicate_element_in_matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number the row and column");
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        System.out.println("Enter the element of array");
        int arr[][]=new int[m][n];
        for (int i=0;i<m;i++){
             for (int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arrayList.add(arr[i][j]);
            }
        }
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i=0;i<arrayList.size();i++){
            if (hashMap.containsKey(arrayList.get(i))){
                int count=hashMap.get(arrayList.get(i));
                hashMap.put(arrayList.get(i),count+1);
            }else {
                hashMap.put(arrayList.get(i),1);
            }
        }
        System.out.println("Duplicates element in the array ");
        for (Map.Entry<Integer,Integer>map:hashMap.entrySet()){
            if (map.getValue()>1){
                System.out.println(map.getKey());
            }
        }
        }
    }

