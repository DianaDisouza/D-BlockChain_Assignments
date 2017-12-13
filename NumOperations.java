package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOperations {

	public int sumOfNumbers(List<Integer> list){
		int sum = 0;
	    for (int i: list) {
	        sum += i;
	    }
	    
	    return sum;
		
	}
	public int productOfNumbers(List<Integer> list){
		int product =1; 
		
		for (int i: list){
			product *= i;
		}
		
		return product;
	}
	public List<Integer> evenNumlist(List<Integer> list){
		ArrayList<Integer>evenNumbers = new ArrayList<Integer>();
		for (int i: list){
			if(i%2==0){
				evenNumbers.add(i);
			}
	}
		return evenNumbers; 
		
	}
	
	public static void main(String[] args) {
		//int[] numbers ={1,5,2,7,4,10,12,67,30,-2};
		List<Integer> ints = Arrays.asList(1,5,2,10);
		
		NumOperations n = new NumOperations();
		System.out.println("Sum of numbers :"+n.sumOfNumbers(ints));
		System.out.println("Product of numbers :"+n.productOfNumbers(ints));
		System.out.println("List of even numbers :"+n.evenNumlist(ints));

	}

}
