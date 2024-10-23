import java.util.Random;
import java.util.*;
class game{
	public int number;
	public int inputnumber;
	public int NoOfGueses = 0;
	public int GetNoOfGueses(){
		return NoOfGueses;
	}
	public void setNoOfGueses(int NoOfGueses) {
		this.NoOfGueses=NoOfGueses;
	}
	game(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void takeuserinput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
	}

	boolean iscorrectnumber() {
		NoOfGueses++;
		if(inputnumber==number) {
			System.out.println("Congratulations !!!!");
			System.out.println("you guessed it correctly, it was "+number+" you guessed it in "+NoOfGueses+" attempts");
			return true;
		}
		else if(inputnumber<number) {
			System.out.println("The number is greater then "+inputnumber);
		}
		else if(inputnumber>number) {
			System.out.println("The number is smaller then "+ inputnumber);
		}
		else {
			System.out.println("Invalid input");
		}
		return false;
	}
}
	public class Guessing_the_number {
	public static void main(String[] args){
		// TODO Auto-generated method stub
	System.out.println("~~~~~~ WELCOME TO NUMBER GUESSING GAME ~~~~~~");
	System.out.println("Enter a number between 1 to 100");
game g = new game();
boolean b = false;
while(!b) {
	g.takeuserinput();
	b=g.iscorrectnumber();
     }
   }
}

