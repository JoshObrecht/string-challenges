import java.util.Scanner;
public class StringChallenges
	{
		static boolean playAgain=true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		public static void main(String[] args)
			{
				do
					{
				System.out.println("Which challenge would you like to run? "
						+ "\n \n"
						+ "1) Use Your Inside Voice \n"
						+ "2) Print Vertical Text \n"
						+ "3) Count The Vowels "
						+ "\n \n"
						+ "Type the number that corresponds with your choice.");
				
				
				int userChoice = userInput2.nextInt();
				switch(userChoice)
				{
					case 1:
						userYourInsideVoice();
						break;
					case 2:
						printVerticalText();
						break;
					case 3:
						countTheVowels();
						break;
					default:
						System.out.println("User input not recognized.");
						break;
				}
				runAgain();
			}
			while(playAgain);
			}


			
		public static void userYourInsideVoice()
		{
			System.out.println("Type something and I'll make your string more polite.");
			String userVoice = userInput.nextLine().toLowerCase();
			System.out.println(userVoice.substring(0, 1).toUpperCase()+userVoice.substring(1));
		}
		public static void printVerticalText()
		{
			System.out.println("Type something out and I'll print every letter vertically.");
			String userResponse=userInput.nextLine();
			for(int i=0; i<userResponse.length(); i++)
				{
					System.out.println(userResponse.substring(i,i+1));
				}
		}
		public static void countTheVowels()
		{
			int vowels=0;
			System.out.println("Type something and I'll tell you the amount of vowels.");
			String userString=userInput.nextLine();
			
			for(int i=0; i<userString.length(); i++)
				{
					switch(userString.substring(i, i+1).toLowerCase())
					{
						case "a":
						case "e":
						case "i":
						case "o":
						case "u":
							vowels=vowels+1;
							break;
						default:
							break;
					}
				}
			System.out.println("Your input had "+vowels+" vowels.");
			
		}
		public static void runAgain()
			{
				System.out.println("");
				System.out.println("Would you like to run another challenge? (Type y/n for yes/no respectively)");
				String userChoice= userInput.nextLine();
				if((userChoice.equalsIgnoreCase("n")))
				{
				System.out.println("See you later!");
				playAgain=false;
				}
				
			}

	}
