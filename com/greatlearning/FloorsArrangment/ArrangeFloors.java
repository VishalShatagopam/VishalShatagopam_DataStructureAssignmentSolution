package com.greatlearning.FloorsArrangment;

import java.util.Stack;

public class ArrangeFloors{
	public void arrange(Stack<Integer>levels, int size) {
		int day = 1;
		int position = 0;	
		Stack<Integer> revfloorlengths =new Stack<Integer>();
		for(int i= size; i>0; i--) {
			int revValue = levels.pop();
			revfloorlengths.push(revValue);
		}			
		for(int i =size; i>0; i--) {
			int floorpos = revfloorlengths.search(i);
			if(floorpos<position) {
				System.out.println(i+" ");
			}
			else {
				position = floorpos;
				while(day<= floorpos) {
					System.out.println("Day: "+ day);
					day++;
				}
				System.out.println(i+" ");
			}

		}
	}
}
