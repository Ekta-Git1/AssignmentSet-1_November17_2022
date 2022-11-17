package Java_Assignment;

import java.util.function.BiPredicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor

public class BiPredicateDemo {
    public static void main(String[] args){
      BiPredicate<Integer, String> condition = (i,s)-> i>20 && s.startsWith("E");
      System.out.println(condition.test(10,"Ekta"));
      System.out.println(condition.test(30,"ABC"));
      System.out.println(condition.test(30,"Ekta"));
      System.out.println(condition.test(30,"PQR"));
      System.out.println(condition.test(40,"Ekta"));
    }        
} 