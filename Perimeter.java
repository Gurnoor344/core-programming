import java.util.*;

class Perimeter{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int length =sc.nextInt();
		int width = sc.nextInt();
		int perimeter = 2 * (length + width);
		System.out.println(perimeter);
	}
}