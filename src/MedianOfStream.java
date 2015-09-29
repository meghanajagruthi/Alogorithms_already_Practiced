import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class MedianOfStream {
	static LinkedList<Integer> array=new LinkedList<Integer>();
	
	
	public static void sortCollection(){
		
		int n=array.size();
		for(int j=1;j<n;j++){
			int key=array.get(j);
			int i=j-1;
			while((i>-1)&&(array.get(i)>key)){
				   array.set(i+1, array.get(i));
				   i--;
			}
			array.set(i+1, key);
		}
		System.out.println("The sorted elements are");
		System.out.println(array.toString());
	}
	public static Double findMedian(Integer number){
		if(array.size()==0){
			array.add(number);
		}
		else{
			array.add(number);
			sortCollection();
			if(array.size()%2==0){
				return (array.get(array.size()/2)+array.get((array.size()/2)-1))/2.0;
			}
			return array.get(array.size()/2)*1.0;
		}
		
		return array.get(0)*1.0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean check=true;
		while(check){
			String input=br.readLine();
		
			if(input.equalsIgnoreCase("EOF")){
				check=false;
			}
			else{
				Integer temp=Integer.parseInt(input);
				System.out.println("The median of the given stream is");
			   System.out.println(findMedian(temp));	
			}
			
		}

	}

}
