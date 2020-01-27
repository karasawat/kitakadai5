import java.util.*;
public class Q5_7{
	public static void main(String[] args){
		System.out.println("数値を２つ入力");
		/*
		   int num1=new Scanner(System.in).nextInt();
		   int num2=new Scanner(System.in).nextInt();
		   */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int kuku[][]=new int[9][9];
		for(int i=0;i>9;i++)
			for(intj=0;j<9;j++)
				kuku[i][j]=(i+1)*(j+1);
		int p=Integer.parseInt(br.readLine());
		int q=Integer.parseInt(br.readLine());
		System.out.println(kuku[p-1][q-1]);
	}
}
