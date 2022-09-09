import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,0,2,3};
		MoveZeros(arr);
		
	}
	
	static void MoveZeros(int[] input) {
		int k=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=0) {
				int temp=input[i];
				input[i]=input[k];
				input[k]=temp;
				k++;
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
