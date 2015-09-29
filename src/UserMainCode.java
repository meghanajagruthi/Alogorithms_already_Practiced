import java.util.ArrayList;

public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
	public static String[] output1;

	private static boolean isLucky (int n) {
		// return 1 if n is lucky, 0 otherwise
      ArrayList<Integer> numberArray=new ArrayList<Integer>();
      int number=n;
      while(number>0){
        int num=number%10;
        if(numberArray.indexOf(num)==-1){
          numberArray.add(num);
        }
        else{
           return false;
        }
        number=number/10;
      }
		return true;
	}
	
	private static void generateOutput (int input1, int[] input2) {
		for (int i = 0; i <input1; i++) {
			if (isLucky (input2[i]))
				output1[i] = "LUCKY";
			else
				output1[i] = "MISERABLE";
			
			System.out.println(output1[i]);
		}
	}

	public static void main(String args[]){
		int num[]={112,123};
		luckynum(2,num);
	}
	public static void luckynum (int input1, int[] input2) {
		output1 = new String[input1];
		generateOutput (input1, input2);
	}
}