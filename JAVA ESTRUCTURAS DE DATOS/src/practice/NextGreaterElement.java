package practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        loop();
    }

    public static void stack(){
        int[] array = {4,2,6,8,1};
        Stack<Integer> pila = new Stack<>();
        pila.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(array[i] > pila.peek()){
                while(!pila.isEmpty()) {
                    System.out.println("the next greater element of " + pila.peek() + " is " + array[i]);
                    pila.pop();
                }
                pila.push(array[i]);
            }else{
                pila.push(array[i]);
            }
        }

    }

    public static void queue(){
        int[] array = {4,2,6,8,1};
        Queue<Integer> cola = new PriorityQueue<>();
        cola.offer(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(array[i] > cola.peek()){
                while(!cola.isEmpty()) {
                    System.out.println("the next greater element of " + cola.peek() + " is " + array[i]);
                    cola.poll();
                }
                cola.offer(array[i]);
            }else{
                cola.offer(array[i]);
            }
        }

    }

    public static void loop(){
        int[] array = {4,2,6,8,1};
        for (int i= 0; i < array.length; i++){
            for (int j= i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    System.out.println("the next greater element of " + array[i] + " is " + array[j]);
                    break;
                }
            }
        }
    }
}
