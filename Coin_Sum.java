import java.util.Scanner;

public class Coin_Sum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int result = sc.nextInt();
        System.out.println(findcoinsno(arr, n, result));
        sc.close();
    }

    static int findcoinsno(int[] arr,int n,int result) {
        int sum = 0,count = 0;
        for(int i=n-1;i>=0;i--) {
            while(sum <= result) {
                if(sum + arr[i] <= result) {
                    sum += arr[i];
                    count++;
                } else {
                    break;
                }
            }
            if(sum == result) {
                return count;
            }
        }
        return -1;
    }
}