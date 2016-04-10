import java.util.Arrays;

/**
	 * Write a description of the program here.
	 * 
	 * @author Lewis et al., (your name)
	 * @version (program version)
	 */

public class Perea_A05Q02 {
	
	/**
	 * Write a description of the program here.
	 * 
	 * @author Lewis et al., (your name)
	 * @version (program version)
	 */

	
	    /**
	     * Program entry point for drop-out stack testing.
	     * @param args Argument list.
	     */    
	    public static void main(String[] args)
	    {
	        ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);//change number for stack capacity
	        
	        System.out.println("DROP-OUT STACK TESTING");
	        
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);       
	        stack.push(5);               
	        
	        System.out.println("The size of the stack is: " + stack.size());        
	        if(!stack.isEmpty())            
	            System.out.println("The stack contains:\n" + stack.toString());
	        
	        stack.pop();        
	        stack.push(7);
	        stack.push(8);      
	        
	        System.out.println("The size of the stack is: " + stack.size());                
	        if(!stack.isEmpty())            
	            System.out.println("The stack contains:\n" + stack.toString());
	    }
	    
	    public static class ArrayDropOutStack<T> implements StackADT<T>
	    {   
	    	 private final static int DEFAULT_CAPACITY = 5;
	    	    
	         private int top;  
	         private T[] stack;
	       
	         /**
	          * Creates an empty stack using the default capacity.
	          */
	         public ArrayDropOutStack()
	         {
	             this(DEFAULT_CAPACITY);
	         }
	     
	         /**
	          * Creates an empty stack using the specified capacity.
	          * @param initialCapacity the initial size of the array 
	          */
	         @SuppressWarnings("unchecked") //see p505.
	         public ArrayDropOutStack(int initialCapacity)
	         {
	             top = 0;
	             stack = (T[])(new Object[initialCapacity]);
	         }
	     
	         /**
	          * Adds the specified element to the top of this stack, expanding
	          * the capacity of the array if necessary.
	          * @param element generic element to be pushed onto stack
	          */
	         public void push(T element)
	         {
	             if (size() == stack.length)
	             {
	            	 for (int counter=0;counter<stack.length-1;counter++)
	                 {
	            		 stack[counter] = stack[counter+1];
	            		 
	                 }
	            	 
	            	 stack[stack.length-1] = element;
	            	 
	                // expandCapacity();
	             } 
	             else 
	             {
	             
	            stack[top] = element;
	             top++;
	             }
	         }
	     
	         /**
	          * Creates a new array to store the contents of this stack with
	          * twice the capacity of the old one.
	          */
	         private void expandCapacity()
	         {
	             stack = Arrays.copyOf(stack, stack.length * 2);   
	         }
	     
	         /**
	          * Removes the element at the top of this stack and returns a
	          * reference to it. 
	          * @return element removed from top of stack
	          * @throws EmptyCollectionException if stack is empty 
	          */
	         public T pop() throws EmptyCollectionException
	         {
	             if (isEmpty())
	                 throw new EmptyCollectionException("stack");
	     
	             top--;
	             T result = stack[top];
	             stack[top] = null; 
	     
	             return result;
	         }
	        
	         /**
	          * Returns a reference to the element at the top of this stack.
	          * The element is not removed from the stack. 
	          * @return element on top of stack
	          * @throws EmptyCollectionException if stack is empty
	          */
	         public T peek() throws EmptyCollectionException
	         {
	             if (isEmpty())
	             	
	                 throw new EmptyCollectionException("stack");
	     
	             return stack[top-1];
	         }
	     
	         /**
	          * Returns true if this stack is empty and false otherwise. 
	          * @return true if this stack is empty
	          */
	         public boolean isEmpty()
	         {
	         	//checks if stack is empty
	         	
	         	return (stack[0]==null);
	         }
	      
	         /**
	          * Returns the number of elements in this stack.
	          * @return the number of elements in the stack
	          */
	         public int size()
	         {
	         	//returns the current size of the stack
	             return top;
	         }

	         /**
	          * Returns a string representation of this stack. The string has the
	          * form of each element printed on its own line, with the top most
	          * element displayed first, and the bottom most element displayed last.
	          * If the list is empty, returns the word "empty".
	          * @return a string representation of the stack
	          */
	         public String toString()
	         {
	         	String result = "";
	             for (int counter = top-1; counter>=0;counter--)
	             {
	               	
	               result += stack[counter] + "\n" ;
	               
	               
	             }
	             if (isEmpty())
	               return ("empty");
	             return result;
	             
	         }
	     }
	    
	}


