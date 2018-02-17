/*
ID: kevin511
LANG: java
TASK:
*/

package stack;

/**
 * 
 * @author Kevin Jiang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        System.out.println(stack.toString());
        System.out.println("---------");
        
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        
        System.out.println(stack.toString());
        System.out.println("---------------");
        
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("---------------");
        
        
    }

}
