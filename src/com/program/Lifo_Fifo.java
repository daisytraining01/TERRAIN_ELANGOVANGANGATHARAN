package com.program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Lifo_Fifo {
	public static void main(String[] args) {
		lifo();
		fifo();
	}
	
		
	public static void lifo() {	
		Stack<Integer> stack = new Stack<Integer>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}
	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop :");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top : " + element);
	}

	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position " + pos);
	}
	public static void fifo() 
    { 
        Queue<Integer> q = new LinkedList<>(); 
  
        for (int i = 0; i < 5; i++) 
            q.add(i); 
  
        System.out.println("Elements of queue-" + q); 
  
        int removedele = q.remove(); 
        System.out.println("removed element-" + removedele); 
  
        System.out.println(q); 
  
        int head = q.peek(); 
        System.out.println("head of queue-" + head); 
  
        int size = q.size(); 
        System.out.println("Size of queue-" + size); 
    } 
} 

/*
 * OUTPUT
 * 
 * Pop : 4 3 2 1 0 Element on stack top : 4 Element is found at position 3
 * Element not found Elements of queue-[0, 1, 2, 3, 4] removed element-0 [1, 2,
 * 3, 4] head of queue-1 Size of queue-4
 */

	
