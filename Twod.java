package day5;

import java.util.Scanner;

public class Twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size");
		Scanner d=new Scanner(System.in);
		int m=d.nextInt();
		System.out.println("Row size:"+m);
		int n=d.nextInt();
		System.out.println("Column size:"+n);
		System.out.println("Enter elements ");
		int twod[][]=new int[m][n] ;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			twod[i][j]=d.nextInt();
			}
		}
		System.out.println("Enter elements are ");
		for(int []x:twod) {
			for(int y:x) {
				System.out.print(y+"   ");
			}
				System.out.println();
			}
	
		}
}
