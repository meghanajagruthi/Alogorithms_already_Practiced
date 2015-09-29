
public class MaximumOfArray {
	
	public static void generateMaxInSubArray(int[] array,int k){
		
		for(int i=0;i<=(array.length-k);i++){
			int max=0;
			for(int j=0;j<k;j++){
				if(max<array[i+j]){
					max=array[i+j];
				}
				
			}
			System.out.print(max);
			System.out.print("  ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int array[]={1,2,3,1,4,5,2,3,6};
		generateMaxInSubArray(array, 3);
	}

}
