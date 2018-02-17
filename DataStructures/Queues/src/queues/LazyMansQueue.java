/*
 * The MIT License
 *
 * Copyright 2018 Kevin Jiang
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
package queues;

import java.util.ArrayList;

/**
 *
 * @author Bob Zhang
 * @param <T>
 */
public class LazyMansQueue<T> {
    
    private ArrayList<T> list;
    
    
    public LazyMansQueue(){
        list = new ArrayList<>();
    }
    
    /**
     * Adds new Object to Queue
     * @param t 
     */
    public void enqueue(T t){
        list.add(t);
    }
    
    /**
     * 
     * @return 
     *      Returns null if queue is empty
     *      Otherwise returns first item. (like a normal queue would).
     */
    public T dequeue(){
        if(list.isEmpty()){
            System.err.println("Queue Empty.");
            return null;
        }else{
            T temp = list.get(0);
            list.remove(0);
            return temp;
        }   
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
      
}
