package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		
	
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);
  
    
    List<Integer> operations = numbers.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println(operations);
    
    List<Integer> operationCube = numbers.stream().map(a -> a*a*a).collect(Collectors.toList());  
    System.out.println(operationCube);
    
    List<String> names =
                Arrays.asList("hi","all","this", "is","heaven");
  
    List<String> result = names.stream().filter(s->s.startsWith("h")).
                          collect(Collectors.toList());
    System.out.println(result);
  
    
    List<String> sort =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(sort);
  
    List<Integer> nums = Arrays.asList(1,1,1,44,67,2,3,4,5,2);
  
    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println(squareSet);
  
  
        int even =numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
    System.out.println(even);
  }
}
