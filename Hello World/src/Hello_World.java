import java.util.*;
public class Hello_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println((i +1) +":" + "Hello World");
		}
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = kbd.nextLine();
		System.out.println("Your name is " + name);
				
	}
}
