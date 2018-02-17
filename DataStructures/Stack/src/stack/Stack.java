/*
 * The MIT License
 *
 * Copyright 2018 Kevin Jiang.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package stack;

import java.util.ArrayList;

/**
 *
 * @author Kevin Jiang
 * @param <T> 
 *      Any random type of Object. (NOT Primitives)
 */
public class Stack<T> {
    
    private ArrayList<T> list;
    
    /**
     * Default Constructor
     */
    public Stack(){
        this.list = new ArrayList<>();
        
    }
    
    /**
     * For instantiating a stack with an already present ArrayList
     * @param list 
     *      ArrayList to be pushed to beginning.
     */
    public Stack(ArrayList<T> list){
        this.list = new ArrayList<>();
        this.list = list;
    }
    
    
    /**
     * Checks to see if Stack is Currently Empty.
     * @return 
     *      Boolean to see if it's empty.
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    /**
     * Gets depth of Stack.
     * @return 
     *      Returns the depth of the Stack as an int.
     */
    public int getSize(){
        return list.size();
    }
    
    /**
     * Pushes a new "T" Object into the Stack.
     * @param t 
     *      Object to be added.
     */
    public void push(T t){
        list.add(t);
    }
    
    /**
     * Pops a "T" object off  the top of the stack.
     * @return
     *      "T" Object at the top of the stack.
     */
    public T pop(){
        T returnable = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return returnable;
    }
    
    /**
     * Turns the Stack into a String from top to bottom
     * @return 
     *      All of the objects with ".toString()" applied to them in a string.
     */
    @Override
    public String toString(){
        StringBuilder returnable = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            returnable.append(list.get(i).toString()).append(", ");
        }
        //removes last comma if not empty
        if(returnable.length() != 0){
            returnable.deleteCharAt(returnable.length() - 2);
        }
        
        return returnable.toString();
    }
}
