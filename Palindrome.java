import java.util.Scanner;
class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp=x,rev=0;
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        else{
            while(temp!=0){                
                rev=rev*10+(temp%10);
                temp=temp/10;
            }
            return rev==x;
        }
        
    }
    public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	System.out.print(isPalindrome(x));
	}
    
}