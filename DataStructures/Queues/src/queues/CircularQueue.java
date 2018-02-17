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

import java.lang.reflect.Array;

/**
 * TODO STILL UNFISHED
 * @author Bob Zhang
 * @param <T>
 */
public class CircularQueue<T> {
    
    private T[] data;
    private int front, rear, maxSize;
    
    public CircularQueue(T sampleItem, int maxItems){
        data = (T[]) Array.newInstance((Class<?>) sampleItem, maxItems);
        
        front = -1;
        rear = -1;
        maxSize = maxItems;
    }
    
    public T front(){
        return data[front];
    }
    
    public T dequeue(){
        front = (front  + 1) % maxSize;
        
        return data[front - 1];
    }
    
}
