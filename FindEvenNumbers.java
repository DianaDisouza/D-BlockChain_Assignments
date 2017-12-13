package a;

import java.util.ArrayList;

public class FindEvenNumbers {

	public static void main(String[] args) {
		int numbers[] ={1,5,2,7,4,10,12,67,30};
		ArrayList<Integer>evenNumbers = new ArrayList<Integer>(); 
		
		for(int i=0;i<numbers.length;i++){
		if(numbers[i]%2==0){
			evenNumbers.add(numbers[i]);
		}
		//System.out.println("Numbers list :"+numbers[i]);
		}
		
		System.out.println("Even numbers present in list :"+evenNumbers);
		
	}

}
