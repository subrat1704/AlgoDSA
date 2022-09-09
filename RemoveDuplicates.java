import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,1,1,2,3,4,5,6,7};
		int arrayLen=0;
		//String elements="";
		/*for(int i=0;i<input.length;i++) {
			if(!elements.contains(String.valueOf(input[i]))) {
				arrayLen++;
				elements+=String.valueOf(input[i]);
			}
		}
		
		System.out.println(String.valueOf(arrayLen));*/
		
		List<Integer> lst=new ArrayList<Integer>();
		List<Integer> lstNew=new ArrayList<Integer>();
		lst.add(1);lst.add(1);lst.add(1);lst.add(2);lst.add(3);lst.add(4);lst.add(5);lst.add(6);lst.add(7);
		for(int i=0;i<lst.size();i++) {
			/*if(!elements.contains(String.valueOf(input[i]))) {
				arrayLen++;
				elements+=String.valueOf(input[i]);
			}*/
			
			if(!lstNew.contains(lst.get(i))) {
				lstNew.add(lst.get(i));
			}
		}
		
		
		System.out.println(String.valueOf(lstNew.size()));
	}

}
