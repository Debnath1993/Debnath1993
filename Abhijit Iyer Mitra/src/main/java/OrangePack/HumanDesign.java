package OrangePack;

import java.util.Scanner;

class TestPart{
	void play() {
		System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		int entry=sc.nextInt();
		System.out.println("Entered number is "+entry);
		
		if(entry==1) {
			System.out.println("Press play to begin the campaign");
		}
		else if(entry==2) {
			System.out.println("Choose your character");
		}
		else if(entry==3) {
			System.out.println("Choose your equipments");
		}
		else if(entry==4) {
			System.out.println("Select the gaming partners");
		}
		else if(entry==5) {
			System.out.println("Check your score per mission");
		}
		else {
			System.out.println("Exit the game");
		}
	}

}
public class HumanDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPart tp=new TestPart();
		tp.play();

	}

}
