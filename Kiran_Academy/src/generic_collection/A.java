package generic_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap to store Nation -> (State -> Cities)
        HashMap<String, Map<String, List<String>>> worldMap = new HashMap<>();

        // Adding India and its states with cities
        HashMap<String, List<String>> indiaStates = new HashMap<>();
        indiaStates.put("Maharashtra", new ArrayList<>(Arrays.asList("Mumbai", "Pune", "Nagpur")));
        indiaStates.put("Karnataka", new ArrayList<>(Arrays.asList("Bangalore", "Mysore", "Hubli")));
        indiaStates.put("Tamil Nadu", new ArrayList<>(Arrays.asList("Chennai", "Coimbatore", "Madurai")));

        // Adding USA and its states with cities
        HashMap<String, List<String>> usaStates = new HashMap<>();
        usaStates.put("California", new ArrayList<>(Arrays.asList("Los Angeles", "San Francisco", "San Diego")));
        usaStates.put("Texas", new ArrayList<>(Arrays.asList("Houston", "Dallas", "Austin")));
        usaStates.put("New York", new ArrayList<>(Arrays.asList("New York City", "Buffalo", "Rochester")));

        // Adding nations to the world map
        worldMap.put("India", indiaStates);
        worldMap.put("USA", usaStates);

        // Printing the data
        for (String country : worldMap.keySet()) {
            System.out.println("Country: " + country);
            for (String state : worldMap.get(country).keySet()) {
                System.out.println("  State: " + state);
                System.out.println("    Cities: " + worldMap.get(country).get(state));
            }
        }


	}

}
