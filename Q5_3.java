import java.util.*;
public class Q5_3{
	public static void main(String[] args){
		System.out.println("数値を10個入力してください");
		int[] num=new int[10];
		for(int i=0;i<10;i++){
			int n=new Scanner(System.in).nextInt();
			num[i]=n;
		}

		System.out.print("偶数:");
		for(int i=0;i<10;i++){
			if(num[i]%2==0){
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
		System.out.print("奇数");
		for(int i=0;i<10;i++){
			if(num[i]%2==1){
				System.out.print(num[i]+" ");
			}
		}
	}
}

