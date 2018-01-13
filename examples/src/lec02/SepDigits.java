package lec02;

public class SepDigits {
	public static void main(String[] args) {
	   int num = 342;
       int first, second, third;
        
       first = num / 100;  //get the first digit

       second = (num % 100) / 10; //get the second digit

       third = num % 10; // get the third digit

	   System.out.println("The first digit is: "+ first);
	   System.out.println("The second digit is: "+ second);
       System.out.println("The third digit is: "+ third);
	}
}
