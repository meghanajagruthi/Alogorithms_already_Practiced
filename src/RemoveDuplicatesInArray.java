
public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={1,1,1,2,3,3,4,5};
		for(int i=0;i<array.length-1;i++){
		
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					array[j]=0;
				}
			}
			
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print("  ");
		}
		
	}

}
