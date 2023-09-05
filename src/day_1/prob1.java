package day_1;

import java.util.Scanner;

public class prob1 {
	private int[] a1;
	private int x;
	/*public prob1() {
		takeInput();
	}*/
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the array size: ");
		x = sc.nextInt();
		System.out.print("Enter the elements: ");
		a1=new int[x];
		for(int i=0;i<x;i++) {
			a1[i]=sc.nextInt();
		}
		sc.close();
		find();
	}
	public void find() {
		int count = 0;
		for(int i=0; i<a1.length;i++){
			int h=a1[i];
			if(h<9) {
				continue;
			}
			else if(h==9) {
				count=1;
				break;
			}
			else {
				while(h>0)
				{
					int t=h%10;
					if(t==9)
					{
						count=1;
						break;
					}
					else {
					h=h/10;
					}
				}
			}
		}
		if(count==1) {
			System.out.println("Bingo");
		}
		else {
			System.out.println("There is no 9 in the array");
		}
	
	}
}


