package Frequency;
import java.util.HashMap;
public class FrequencyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,3,3,4,4,4,4};
		
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int element:arr) {
			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0+1)+1);
		}
		
		for(HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet() ) {
			System.out.println(entry.getKey()+" Frequency :"+entry.getValue());
		}
		System.out.println(frequencyMap);
	}

}