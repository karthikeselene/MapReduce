package algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class CountWord {
	
	public static void main(String[] args) {
		String fileName = "./input.txt";
		String line = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			line = bufferReader.readLine();
			System.out.println(line);
			String input = line.toUpperCase().trim();
			String[] items = input.split(",");
			HashMap<String, Integer> map = new HashMap<>();
			for (String item : items) {
				if(map.containsKey(item)){
					map.put(item, map.get(item)+1);
				}else{
					map.put(item, 1);
				}
			}
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.println(key+":"+map.get(key));
			}
			bufferReader.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
