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

		} else {
			Scanner kbd1 = new Scanner(System.in);
			System.out.println("Why are you upset?: ");
			String upsetReason;
			upsetReason = kbd1.nextLine();
			int Reasoncounter = 0; 
			 Reasoncounter = Reasoncounter + 1;			
			String[] feedBack = new String[Reasoncounter];
			if (upsetReason != "") {
				for (int i = 0; i < Reasoncounter; i++) {
					feedBack[i] = upsetReason;
					System.out.println("The first thing that can help is " + feedBack[i] + " according to you");
				}
			}

			System.out.println("Thank you for the feed back I will see what we can do to improve");

		}
	}

}
