import java.util.*;
public class Q5_6{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		for(int i=0;i<9;i++){
			int kuku[][] = new int[9][];
			for(int j=0;j<9;j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}

		// 配列 kuku に値を代入する
		

		for( int i = 0 ; i < 9 ; i++ )
		{
			for( int j = 0 ; j < 9 ; j++ )
				System.out.printf( " %2d", kuku[i][j] );

			System.out.println();
		}
	}
}
