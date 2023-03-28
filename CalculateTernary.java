package day2;
//wap using ternary operator to perform either sum or subtraction of two number 
//if a > b perform sum 
//otherwise perform subtraction 
public class CalculateTernary {

	public static void main(String[] args) {
		int x=33;
		int y=32;
		
		 int result =x>y ? (x+y) : (x-y);
		 System.out.println(result);
		 
		 boolean n = x>20 ? true: false;
		 
		 char p= x>10 ? 'a':'b';

	}

}
