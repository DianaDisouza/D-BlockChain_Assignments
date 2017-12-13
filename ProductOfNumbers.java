package a;

public class ProductOfNumbers
{
 public static void main(final String[] args)
 {
  
  int prod = 1;
  int[] nums = {1,2,3,4,5};
  for (int i : nums)
  {
    prod *= i;
  }
  System.out.println("Product of numbers :"+prod);
 }
 
}