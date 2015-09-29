import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MatrixTracer {

	
	
	public static void addTwoMatrices(Integer array[][],Integer array1[][]){
		Integer newLength=Math.min(array.length, array[0].length);
		Integer array2[][]=new Integer [newLength][newLength];
		int sum=0;
		
		for(int i=0;i<newLength;i++){
			
			for(int j=0;j<newLength;j++){
			    array2[i][j]=array1[i][j]+array[j][i]; 
			    if(i==j){
			    	sum+=array2[i][j];
			    }
				
			}
			
		}
		
		
		System.out.println(sum);
		
	}
	public static void getTwoMatrices(String input1[]){
		int row1=Integer.parseInt(input1[0]);
		int col1=Integer.parseInt(input1[1]);
		
		Integer matrixA[][]=new Integer[row1][col1];
		Integer matrixB[][]=new Integer[col1][row1];
		int k=1;
		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
				matrixA[i][j]=k;
				matrixB[j][i]=k;
				k++;
			}
			
		}
		
		/*k=1;
		for(int i=0;i<col1;i++){
			for(int j=0;j<row1;j++){
				matrixB[i][j]=k;
				k++;
			}
			
		}
		
		cout<<"4"<<endl; 
      cout<<"91 9891897644"<<endl;
      cout<<"81 82bajd0000"<<endl; 
      cout<<"7 8810384949"<<endl; 
      cout<<"61 6289065476"<<endl;
		
		*
		*/
		
		addTwoMatrices(matrixA,matrixB);
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer input=Integer.parseInt(br.readLine());
		while(input>0){
			String input1[]=br.readLine().split(" ");
			
			getTwoMatrices(input1);
			input--;
		}
		

	}

}
