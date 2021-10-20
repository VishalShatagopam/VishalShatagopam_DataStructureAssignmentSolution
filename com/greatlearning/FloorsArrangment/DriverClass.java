package com.greatlearning.FloorsArrangment;
import java.util.Scanner;
import java.util.Stack;

public class DriverClass {

	public static void main(String[] args) {
		ArrangeFloors ar = new ArrangeFloors();  
		Scanner sc = new Scanner(System.in);
		Stack<Integer> levels = new Stack<Integer>();
		System.out.println("enter the total no of floors in the building: ");
		int size = sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("enter the floor size given on day :"+(i+1));
			levels.push(sc.nextInt());			
		}
		ar.arrange(levels, size);
		sc.close();
	}

}
