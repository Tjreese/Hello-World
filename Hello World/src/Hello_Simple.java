import java.util.*;

public class Hello_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		
		String name;
		
		name = kbd.next();
		
		System.out.print("Hello " + name + " how are you doing today from 1 to 5: ");
		
		int mood;
		
		mood = kbd.nextInt();
		
		if (mood > 3) {
			System.out.println("It seems that your having a average day or above");
			
		}
		else {
			System.out.println("Why are you upset?");
		}
	}

}
