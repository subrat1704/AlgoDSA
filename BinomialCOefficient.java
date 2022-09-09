import java.util.ArrayList;
import java.util.List;

public class BinomialCOefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = nthRowOfPascalTriangle(5);
		System.out.println(lst.toString());

	}
	
	public static List<Integer> nthRowOfPascalTriangle(int n) {
	    // Write your code here
		List<Integer> lst=new ArrayList<Integer>();
	        if(n==0)
	            System.out.println("1");
	        else {
	            for(int i=0;i<n;i++){
	                int coef=BinomialCoefficient(n-1,i);
	                lst.add(coef);
	            }
	        }
	        
	        return lst;
	    }
	    
	
	static void NthRowPasclTriangle(int n) {
		if(n==0)
			System.out.println("1");
		else {
			for(int i=0;i<n;i++){
				int coef=BinomialCoefficient(n-1,i);
				System.out.print(String.valueOf(coef)+"\t");
			}
		}
	}
	
	static int BinomialCoefficient(int n,int r) {
		float coef=1;
		int k=n-r;
		while(n>k && r>0) {
			coef=(coef*n)/r;
			n--;
			r--;			
		}
		return (int)coef;
	}

}
