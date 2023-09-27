//lex_auth_012887123561635840652
//do not modify the above line

package stackassignment1;

public class Tester {
	public static void main(String args[]) {
        
        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        calculateSum(stack);
            
        System.out.println("Updated stack");
        stack.display();
    }

    public static void calculateSum(Stack stack) {
        //Implement your code here
    	Stack stack1=new Stack(10);
    	int sum=0;
    	while(!stack.isEmpty()) {
    		int n=stack.pop();
    		sum=sum+n;
    		//System.out.println(sum);
    		stack1.push(n);
    	}
    	//stack1.display();
    	stack.push(sum);
    	while(!stack1.isEmpty()) {
    		stack.push(stack1.pop());
    	}
    }
}
