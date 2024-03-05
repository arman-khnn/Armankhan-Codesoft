package internship;
import java.util.*;
import java.util.Random.*;

public class numbers {
	public static void main(String args[]) {
           	generateRandom ();    //generate the random number 
             	
	}
	public static void generateRandom() {
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		 int randomnumber = rand.nextInt(100) + 1; 
//		 System.out.println("Random number is + Random number");
		 int count=0;
		 while (randomnumber>0) {
			 System.out.println("Guess the number between  1 to 100");
			 int guess_number = scn.nextInt();
			 count++;
			 if(guess_number == randomnumber ) {
				 System.out.println("you won");
				 System.out.println("You Guess the no in " + count + " tries");
				 if(count==1) {
						System.out.println("YOU SCORE: 100/100 Points");
				 }
				 else if(count==2) {
						System.out.println("YOU SCORE: 90/100 Points");
					}
				 else if(count==3) {
						System.out.println("YOU SCORE: 80/100 Points");
					}
				 else if(count==4) {
						System.out.println("YOU SCORE: 70/100 Points");
					}
				 else if(count==5) {
						System.out.println("YOU SCORE: 60/100 Points");
					}
				 else if(count==6) {
						System.out.println("YOU SCORE: 50/100 Points");
					}
				 else if(count==7) {
						System.out.println("YOU SCORE: 40/100 Points");
					}
				 else if(count==8) {
						System.out.println("YOU SCORE: 30/100 Points");
					}
				 else if(count==9) {
						System.out.println("YOU SCORE: 20/100 Points");
					}
				 else if(count==10) { 
						System.out.println("YOU SCORE: 10/100 Points");
					}
				 break;
				}
			 else if(randomnumber > guess_number) {
					System.out.println("OOh! Guess number is Smaller than the orignal number, Guess another.");
				}
				else if(randomnumber < guess_number){
					System.out.println("OOh! Guess number is higher than the orignal number, Guess another.");
				}
				if(count==10) {
					System.out.println("Better Luck Next Time");
					break;

				}
		 }
		        //Play another time or leave it?
		    	System.out.println("Press 1 to another time.");
		    	System.out.println("Press 0 to leave.");
		    	int choice=scn.nextInt();
		    	if(choice==1) {
		    		  generateRandom();
		    	}
		    	else {
		    		return;
		    	}
				scn.close();
			 
	       }
		 
	}

	
		

	



 