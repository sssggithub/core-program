package day5;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number x and y");
		Scanner sw=new Scanner(System.in);
		int x=sw.nextInt();
		int y=sw.nextInt();
		System.out.println("Enter number:" +x+ " " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swap number:" +x+ " " +y);
	}

}
