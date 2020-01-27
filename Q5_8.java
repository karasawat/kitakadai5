import java.util.*;
public class Q5_8{
	public static void main(String[] args){
		System.out.println("数値を10個入力してください");
		int[] num=new int[10];
		for(int i=0;i<10;i++){
			int n=new Scanner(System.in).nextInt();
			num[i]=n;
		}
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(num[i]>num[j]){
					int r=num[i];
					num[i]=num[j];
					num[j]=r;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(num[i]+" ");
		}
	}
}










		/*int[] num=new Scanner.(System.in).nextInt();
		  for(int i=9;i<=0;i--){

		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int values[]=new int[10];
		  for( int i=0;i<10;i++)
		  values[i]= nteger.parseInt(br.readLine());
		  for(int i=0;i<10;i++){
		  for(int j=i+1;j<1;j++){
		  if(values[i]>values[j]){
		  int t=values[i];
		  values[i]=values[j];
		  values[j]=t;
		  }
		  }
		  }

		  for(int i=0;i<10;i++)
		  System.out.print(values[i]+" ");
		  }
	}
}
*/
