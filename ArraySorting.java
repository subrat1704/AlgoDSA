import java.util.ArrayList;
import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);lst.add(3);lst.add(5);lst.add(6);
		int len=lst.size();
		int iteration=0;
		
		if(lst.size()%2==0)
			iteration=lst.size()/2;
		else
			iteration=lst.size()/2+1;
		for(int i=0;i<iteration;i++) {
			int temp=lst.get(i);
			lst.set(i,lst.get(len-1-i));
			lst.set(len-1-i, temp);
		}
		
		System.out.println(lst.toString());
	}

}
