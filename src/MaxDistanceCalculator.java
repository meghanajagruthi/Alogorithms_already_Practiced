import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class MaxDistanceCalculator {

	public static Double calculateMaximumDistance(Integer speed[],Integer fuel[],Integer limitOfFuel){
		
	double maxDistance=0.0;
	for(int i=0;i<speed.length;i++){
		if(((limitOfFuel/fuel[i])*speed[i]*1.0)>maxDistance){
			System.out.println((limitOfFuel/fuel[i])*speed[i]*1.0);
			maxDistance=(limitOfFuel/fuel[i])*speed[i]*1.0;
		}
	}
		return maxDistance;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer length=Integer.parseInt(br.readLine());
		String input1[]=br.readLine().split(" ");
		String input2[]=br.readLine().split(" ");
		Integer in1[]=new Integer[input1.length];
		Integer in2[]=new Integer[input2.length];
		for(int i=0;i<in1.length;i++){
			in1[i]=Integer.parseInt(input1[i]);
		}
		for(int i=0;i<in2.length;i++){
			in2[i]=Integer.parseInt(input2[i]);
		}
		Integer limit=Integer.parseInt(br.readLine());
		Double maxDist=calculateMaximumDistance(in1,in2,limit);
		 
		    DecimalFormat df = new DecimalFormat("####0.000");
		    System.out.println( df.format(maxDist));
		

	}

}
