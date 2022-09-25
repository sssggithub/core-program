package day5;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three number");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		System.out.println("First number:"+a);
		int b=z.nextInt();
		System.out.println("Third number:"+b);
		int c=z.nextInt();
        System.out.println("Third number:"+c);
	if(a<b&&a>c || a<c&&a>b) {
		System.out.println("Second largest number:"+a);
	}
		else if(b<a&&b>c || b<c&&b>a) {
			System.out.println("Second largest number:"+b);
		}
		else  {
			System.out.println("Second largest number:"+c);
		}
	}

}
