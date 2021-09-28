package com.bl.stack;

public class Stack {
		Node top;
	   public Stack() {
	       this.top = null;
	   }

	    public void push(int x) // insert at the beginning
	    {
	        
	        Node temp = new Node();
	 
	        // check if stack (heap) is full. Then inserting an
	        if (temp == null) {
	            System.out.print("\nHeap Overflow");
	            return;
	        }
	 
	        // initialize data into temp data field
	        temp.data = x;
	 
	        // put top reference into temp link
	        temp.link = top;
	 
	        // update top reference
	        top = temp;
	    }
	 
	    // Utility function to check if the stack is empty or not
	    public boolean isEmpty()
	    {
	        return top == null;
	    }
	 
	    // Utility function to return top element in a stack
	    public int peek()
	    {
	        // check for empty stack
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	    }
	 
	    // Utility function to pop top element from the stack
	   	public void display()
	    {
	        // check for stack underflow
	        if (top == null) {
	            System.out.printf("\nStack Underflow");
	        }
	        else {
	            Node temp = top;
	            while (temp != null) {
	 
	                // print node data
	                System.out.printf("%d->", temp.data);
	 
	                // assign temp link to temp
	                temp = temp.link;
	            }
	        }
	    }
	}