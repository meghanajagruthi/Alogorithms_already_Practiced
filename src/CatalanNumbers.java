
public class CatalanNumbers {
	int sum=0;
	public int catalanNumberGen(int n,int i){
		if(n<=1) return 1;
		if(i==0) return 1;
		
		
		sum= sum+catalanNumberGen(n,i-1)*catalanNumberGen(n-i-1,i-1);
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalanNumbers c=new CatalanNumbers();
		//for(int i=0;i<10;i++){
			System.out.println(c.catalanNumberGen(2,10));
		//}
	}

}
