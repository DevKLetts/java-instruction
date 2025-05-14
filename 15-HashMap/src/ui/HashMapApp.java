package ui;
import java.util.HashMap;

import util.ConsoleUtil;

public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleUtil.printHeader("Welcome to Hash Maps!","=");
		
		// Create a hash map of state abbreviations and names
		// OH - Ohio, IN - Indiana, KY - Kentucky, MI - Michigan
		
		HashMap<String, String> states = new java.util.HashMap<>();
		
		states.put("OH", "Ohio");
		states.put("IN", "Indiana");
		states.put("KY", "Kentucky");
		states.put("MI", "Michigan");
		states.put("IL", "Illinois");
		states.put("WI", "Wisconsin");
		states.put("PA", "Pennsylvania");
		
		System.out.println("State Abbreviations:");
		for (String key : states.keySet()) {
			System.out.println(key + " - " + states.get(key));
		}
		//existence
			System.out.println("Does the map contain IN? " + states.containsKey("IN"));
			System.out.println("Does the map contain TX? " + states.containsKey("TX"));
			System.out.println("Does the map contain Ohio? " + states.containsValue("Ohio"));
			System.out.println("Does the map contain Texas? " + states.containsValue("Texas"));
			System.out.println("Does the map contain KY? " + states.keySet().contains("KY"));
			System.out.println("Does the map contain Kentucky? " + states.values().contains("Kentucky"));
			
			// sorted list of states
			System.out.println("Sorted list of states and abbreviations:");	
			// sort the keys and print them
			//states.keySet().stream().sorted().forEach(System.out::println);
			// sort the values and print them
			//states.values().stream().sorted().forEach(System.out::println);
			// sort the keys and print them with their values
			states.keySet().stream().sorted().forEach(key -> System.out.println(key + " - " + states.get(key)));
			

			
		
		
	}

}
