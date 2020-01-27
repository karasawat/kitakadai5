import java.util.*;
public class Q5_2{
	public static void main(String[] args){
		int[] num=new int[10];
		for(int i=0;i<10;i++){
			int n=new Scanner(System.in).nextInt();
			num[i]=n;
		}
		for(int i=9;i<=0;i--){
			System.out.println(num[i]+" ");
		}
	}
}


		/*
		int=new Scanner(System.in).nextInt;
		 
		int num[]=new int[10];
		for(int i=0;i<10;i++){
			sum[i]=Scanner(System.in).nextInt;
		}
		for(int i=9;i<=0;i--){
			System.out.println(sum[i]);
		}
	}

*/
