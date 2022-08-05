package StreamAPI;

import java.util.ArrayList;
import java.util.List;

import com.bl.java8.lambdaexpresion.Main;

public class StreamAPI1 {
	public static void main(String[] args) {
		
	
	List<String> list = new ArrayList<>();
	list.add("Sana");
	list.add("Mona");
	list.add("Aman");
	list.add("Rahul");
	list.add("Divya");
	list.add("Resha");
	list.add("Priya");
	list.add("Amya");
	list.add("ariya");



	list.stream().filter((s) -> s.startsWith("P"))
    .forEach(System.out::println);
	
	
	list.stream().filter((s) -> s.startsWith("A"))
    .map(String::toUpperCase)
    .forEach(System.out::println);
	
	list.stream().sorted()
    .map(String::toUpperCase)
    .forEach(System.out::println);
	
	
	long count = list.stream()
		    .filter((s) -> s.startsWith("A"))
		    .count();
		 
		System.out.println(count); 
	}
}

