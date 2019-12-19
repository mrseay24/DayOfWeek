import java.util.*;

public class DayOfWeek {

	public static char getChar() {

		try {
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		char ch = str.charAt(0);

		return ch;	
		}
		catch(Exception ex)
		{
		return 'E'; // no char entered
		}

		}
		public static void main(String[] args) {

		System.out.println("Please input first letter in day ?");
		char ch1 = getChar();
		// use switch structure to find the day
		switch (ch1) {
		case 'm':
		case 'M':
		System.out.println("Monday");
		break;
		case 't':
		case 'T':
		case 's':
		case 'S':	
		System.out.println("Please input second letter in day ?");
	char ch2 = getChar();
		
	if('t'){
		System.out.println("Tuesday");
				System.out.println("Thursday");
				System.out.println("Saturday");
				System.out.println("Sunday");	
		break;		
		case 'w':
		case 'W':
		System.out.println("Wednesday");
		break;
		case 'f':
		case 'F':
		System.out.println("Friday");
		break;
		default:
		System.out.println("Invalid day");
		break;
				
		
	
		}
		
		//if (ch1 == 't') {
			//System.out.println("Please input second letter in day ?");
		//}
		//else
		//if(ch1 == 's'){
			//System.out.println("Please input second letter in day ?");
	}
		//else
			//if(ch1 != ch2){
				
				//System.out.println("Invalid day");
			}
//}
//}
