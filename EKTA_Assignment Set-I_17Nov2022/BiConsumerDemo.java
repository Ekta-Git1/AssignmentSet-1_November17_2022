package Java_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
   public static void main(String[] args) {
       Map<Integer,String> map = new HashMap<>();
       map.put(1, "One");
       map.put(2, "Two");
       map.put(3, "Three");
       map.put(4, "Four");
       map.put(5, "Five");

       BiConsumer<Integer,String> biConsumer = (key,value) -> 
	   System.out.println("Key:"+ key+" Value:"+ value);
       map.forEach(biConsumer);
   }    
} 