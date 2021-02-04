import java.util.Scanner;
import java.util.Random;

public class TreasureHunt {

	public static void main(String[] args) {
		
		// create play boolean set to true; game will always run unless play = false
		// if the output does happen to be true, the gameCheck will also run a method called getInput
			
			gameCheck();
			
		//called after gameCheck (and getInput) are finished. Analysis and finalizes results
			
		//showResult();
	}
	
		
		
	@SuppressWarnings({ "unused", "resource" })
	public static void gameCheck() {
		
		
		//introduce user to the game
	System.out.println("\nWelcome to Treasure Hunt! Here is how to play:\n");
	System.out.println("The objective of this game is to find hidden treasure in one of the nine grid squares shown\n");
	System.out.println("The valid commands for this game are A(1, 2, 3), B(1, 2, 3) and C(1, 2 , 3). If you would like to quit, enter \"q");
		
		//declare play boolean as mentioned in previous comment
	boolean play = true;
		//This is where play is set to true or false
	int firstSelec = 0;
	
	Scanner quickCheck = new Scanner(System.in);
	do {
	System.out.println("\nPlay? Y or N");
	String gameCheckChoice = quickCheck.nextLine();
	if(gameCheckChoice.equalsIgnoreCase("N")) {
		play = false;
		firstSelec = 1;
	}else if(gameCheckChoice.equalsIgnoreCase("y")) {
		firstSelec = 2;
	}
	
	if(firstSelec == 2) {
		getInput();
	}
	}while(firstSelec == 0);
	}
	
	static int guessesTried = 0;

	
	@SuppressWarnings("resource")
	public static void getInput() {
		
		int choiceReal = 0;
		Scanner x = new Scanner(System.in);
		Random treasureSpot = new Random();
		int treasurePlace = 0;
		
		boolean A1isTreasure = false;
		boolean A2isTreasure = false;
		boolean A3isTreasure = false;
		boolean B1isTreasure = false;
		boolean B2isTreasure = false;
		boolean B3isTreasure = false;
		boolean C1isTreasure = false;
		boolean C2isTreasure = false;
		boolean C3isTreasure = false;

		
		for(int counter=1; counter<=1; counter++) {
			treasurePlace = 1+treasureSpot.nextInt(9);
	}
		// debug print
		 System.out.println(treasurePlace);
		
		if(treasurePlace == 1) {
			A1isTreasure = true;
		}else if(treasurePlace == 2) {
			A2isTreasure = true;
		}else if(treasurePlace == 3) {
			A3isTreasure = true;
		}else if(treasurePlace == 4) {
			B1isTreasure = true;
		}else if(treasurePlace == 5) {
			B2isTreasure = true;
		}else if(treasurePlace == 6) {
			B3isTreasure = true;
		}else if(treasurePlace == 7) {
			C1isTreasure = true;
		}else if(treasurePlace == 8) {
			C2isTreasure = true;
		}else{
			C3isTreasure = true;
		}
		
		System.out.println(" ________________");
		System.out.println("|   | 1 | 2 | 3 |");
		System.out.println("-----------------");
		System.out.println("| A |   |   |   |");
		System.out.println("-----------------");
		System.out.println("| B |   |   |   |");
		System.out.println("-----------------");
		System.out.println("| C |   |   |   |");
		System.out.println("-----------------");
		
		do {
		
			
			System.out.println("Enter your first selection to find the treasure (you have three guesses). Enter \"q\" to quit.");
			String squareSelect = x.nextLine();
			
			if(squareSelect.equalsIgnoreCase("q")) {
				System.exit(0);
			}else if(squareSelect.equalsIgnoreCase("A1") && (A1isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A | X |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				showResult();
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("A1") && (A1isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A | O |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("A2") && (A2isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   | X |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				showResult();
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("A2") && (A2isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   | O |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("A3") && (A3isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   | X |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				showResult();
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("A3") && (A3isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   | O |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("B1") && (B1isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B | X |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				showResult();
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("B1") && (B1isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B | O |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("B2") && (B2isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   | X |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				showResult();
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("B2") && (B2isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   | O |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;

			}else if(squareSelect.equalsIgnoreCase("B3") && (B3isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   | X |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				choiceReal = 1;
				showResult();
			}else if(squareSelect.equalsIgnoreCase("B3") && (B3isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   | O |");
				System.out.println("-----------------");
				System.out.println("| C |   |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;
			}else if(squareSelect.equalsIgnoreCase("C1") && (C1isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C | X |   |   |");
				System.out.println("-----------------");
				choiceReal = 1;
				showResult();
			}else if(squareSelect.equalsIgnoreCase("C1") && (C1isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C | O |   |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;
			}else if(squareSelect.equalsIgnoreCase("C2") && (C2isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   | X |   |");
				System.out.println("-----------------");
				choiceReal = 1;
				showResult();
			}else if(squareSelect.equalsIgnoreCase("C2") && (C2isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   | O |   |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;
			}else if(squareSelect.equalsIgnoreCase("C3") && (C3isTreasure == true)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   | X |");
				System.out.println("-----------------");
				choiceReal = 1;
				showResult();
			}else if(squareSelect.equalsIgnoreCase("C3") && (C3isTreasure == false)) {
				System.out.println(" ________________");
				System.out.println("|   | 1 | 2 | 3 |");
				System.out.println("-----------------");
				System.out.println("| A |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| B |   |   |   |");
				System.out.println("-----------------");
				System.out.println("| C |   |   | O |");
				System.out.println("-----------------");
				System.out.println("Sorry, but the treasure was not there. Try again");
				guessesTried += 1;
				choiceReal = 1;
			}
			
			if(guessesTried == 1) {
				Scanner y = new Scanner(System.in);
				System.out.println("You have 2 guesses left");
				String secondGuess = y.nextLine();
				
				if((secondGuess.equalsIgnoreCase("A1") && (A1isTreasure == false))){
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A | O |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but the treasure was not there. One more try!");
					guessesTried += 1;
					
				}else if((secondGuess.equalsIgnoreCase("A1") && (A1isTreasure == true))) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A | X |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("A2")) && (A2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   | O |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but the treasure was not there. One more try!");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("A2")) && (A2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   | X |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("A3")) && (A3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   | O |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Unlucky! The treasure was not there. One more try!");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("A3")) && (A3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   | X |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("B1")) && (B1isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B | O |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but this is not the treasure you are looking for. One more try!");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("B1")) && (B1isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B | X |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("B2")) && (B2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   | O |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Whoops! The treasure isn't here either. One more try!");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("B2")) && (B2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   | X |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("B3")) && (B3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   | O |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Thats another guess down the drain. Try again (1 attempt left)");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("B3")) && (B3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   | X |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("C1")) && (C1isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C | O |   |   |");
					System.out.println("-----------------");
					System.out.println("Darn, the treasure isn't here either. One more try!");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("C1")) && (C1isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C | X |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("C2")) && (C2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   | O |   |");
					System.out.println("-----------------");
					System.out.println("...maybe... nope. Not here. One more try");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("C2")) && (C2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   | X |   |");
					System.out.println("-----------------");
					showResult();
				}else if((secondGuess.equalsIgnoreCase("C3")) && (C3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   | O |");
					System.out.println("-----------------");
					System.out.println("No luck. One more try, though");
					guessesTried += 1;
				}else if((secondGuess.equalsIgnoreCase("C3")) && (C3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   | X |");
					System.out.println("-----------------");
					showResult();
				}
			} // if statement for second guessing segment
			
			if(guessesTried == 2) {
				Scanner z = new Scanner(System.in);
				System.out.println("You have 1 guess left");
				String thirdGuess = z.nextLine();
				
				if((thirdGuess.equalsIgnoreCase("A1")) && (A1isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A | O |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but the treasure was not there.");
					guessesTried += 1;
					
				}else if((thirdGuess.equalsIgnoreCase("A1") && (A1isTreasure == true))) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A | X |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("A2")) && (A2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   | O |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but the treasure was not there!");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("A2")) && (A2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   | X |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("A3")) && (A3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   | O |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Unlucky! The treasure was not there!");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("A3")) && (A3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   | X |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("B1")) && (B1isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B | O |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Sorry, but this is not the treasure you are looking for!");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("B1")) && (B1isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B | X |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("B2")) && (B2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   | O |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Whoops! The treasure isn't here either!");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("B2")) && (B2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   | X |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("B3")) && (B3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   | O |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					System.out.println("Womp Womp...");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("B3")) && (B3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   | X |");
					System.out.println("-----------------");
					System.out.println("| C |   |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("C1")) && (C1isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C | O |   |   |");
					System.out.println("-----------------");
					System.out.println("Darn, the treasure isn't here either!");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("C1")) && (C1isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C | X |   |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("C2")) && (C2isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   | O |   |");
					System.out.println("-----------------");
					System.out.println("...maybe... nope. Not here.");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("C2")) && (C2isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   | X |   |");
					System.out.println("-----------------");
					showResult();
				}else if((thirdGuess.equalsIgnoreCase("C3")) && (C3isTreasure == false)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   | O |");
					System.out.println("-----------------");
					System.out.println("No luck.");
					guessesTried += 1;
				}else if((thirdGuess.equalsIgnoreCase("C3")) && (C3isTreasure == true)) {
					System.out.println(" ________________");
					System.out.println("|   | 1 | 2 | 3 |");
					System.out.println("-----------------");
					System.out.println("| A |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| B |   |   |   |");
					System.out.println("-----------------");
					System.out.println("| C |   |   | X |");
					System.out.println("-----------------");
					showResult();
				}
				
			} // if statement for third (and final) guessing segment
			
			}while(choiceReal == 0);
		
		if(guessesTried == 3) {
			System.out.println("\nYou're all out of guesses! The treasure was in square: " + treasurePlace);
		}	//return guessesTried;
	}
	

	public static void showResult() {
		if(guessesTried == 0) {
		System.out.println("Congradulations! You found the treasure on your " + (guessesTried + 1) + "st try!");
		}else if(guessesTried == 1) {
		System.out.println("Congradulations! You found the treasure on your " + (guessesTried + 1) + "nd try!");
		}else if(guessesTried == 2) {
		System.out.println("Congradulations! You found the treasure on your " + (guessesTried + 1) + "rd try!");
		}
	}
}

