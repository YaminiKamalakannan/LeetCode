import java.util.Scanner;
class Reverse {
	
public  static  int reverse(int x) {
	
      Integer temp=x, rev=0,rem=0;
     
      
    
      while(temp!=0){
            rem=temp%10;
			temp=temp/10;			
	        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;			
            rev= rev*10+rem;            
        }		
      return rev;	
}
public static void main(String[] agrs){
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	System.out.print(reverse(x));
	
}
	
}
/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could
 only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
  */
