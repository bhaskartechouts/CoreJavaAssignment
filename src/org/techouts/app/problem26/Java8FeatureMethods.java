package org.techouts.app.problem26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Java8FeatureMethods {

	public static void main(String[] args) {   
		List<String> str = new ArrayList<String>();   
		str.add("Techouts");
		str.add("Software");
		str.add("Company");
		str.add("IT");
		Optional<String> checkNull =  
				Optional.ofNullable(str.get(2));   
		if (checkNull.isPresent()) {   
			String word = str.get(2).toUpperCase();   
			System.out.println(word);   
		} else  
			System.out.println("word is null");   
		Optional<String> empty = Optional.empty(); 
		System.out.println(empty); 

		Optional<String> value = Optional.of(str.get(2)); 
		System.out.println(value); 

		int i[] = { 9,8,7,6,5,4,3,2}; 
		System.out.print("Orginal Array : "); 
		Arrays.stream(i) 
		.forEach(n -> System.out.print(n + " ")); 
		System.out.println(); 
		Arrays.parallelSort(i); 
		System.out.print("Sorted Array: "); 
		Arrays.stream(i) 
		.forEach(n -> System.out.print(n + " "));


		StringJoiner s1 = new StringJoiner("$");    
		s1.add("Techouts");  
		s1.add("Software");  
		s1.add("Company");  
		s1.add("IT");  
		System.out.println(s1);  


		List<CollectorsExample> list = new ArrayList<>();
		list.add(new CollectorsExample(1, "Techouts"));
		list.add(new CollectorsExample(2, "Company"));
		list.add(new CollectorsExample(3, "Software"));
		list.add(new CollectorsExample(4, "IT"));

		Integer sumId =   
				list.stream().collect(Collectors.summingInt(x->x.id));  
		System.out.println("Sum of id's: "+sumId);  

		Long noOfElements = list.stream()  
				.collect(Collectors.counting());  
		System.out.println("Total elements : "+noOfElements);
	}
}
