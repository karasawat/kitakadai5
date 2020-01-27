import java.util.*;
public class Q5_1{
	public static void main(String[] args){
		System.out.println("数値を10個入力");
		int[] num=new int[10];
		for(int i=0;i<10;i++){
			int n=new Scanner(System.in).nextInt();
			num[i]=n;
		}
		for(int i=0;i<10;i++){
			System.out.print(num[i]*2+" ");
		}
	}
}
