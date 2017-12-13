package a;
 import java.util.*;

public class SumOfNumbers {
	
	public static int sum (List<Integer> list) {
	    int sum = 0;
	    for (int i: list) {
	        sum += i;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3,50);
		int sum = SumOfNumbers.sum(ints);
		System.out.println(sum);

	}

}
