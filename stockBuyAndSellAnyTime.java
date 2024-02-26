import java.util.Scanner;

public class stockBuyAndSellAnyTime {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),profit=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<n-1;i++){
        if(a[i]<a[i+1]){
profit+=a[i+1]-a[i];
        }
    }
    System.out.println(profit);
}
    
}