package java18.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("USR123", 125555);
		mp.put("USR124", 225555);
		mp.put("USR125", 253555);
		mp.put("USR126", 255455);
		mp.put("USR127", 255555);
		
		
		Stream<String> keyStream = mp.keySet().stream();
		Stream<Integer> valueStream = mp.values().stream();
		
		
		keyStream.forEach(System.out :: println);
		valueStream.forEach(System.out :: println);
	}
}
