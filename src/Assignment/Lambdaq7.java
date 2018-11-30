package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambdaq7 {
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>(5);
	      map.put("name  ", "Madhuri ");
	      map.put("age ", "23");
	      map.put("D.O.B ", " 22/6/1995 ");
	      
	      map.entrySet().stream().map(entry->entry.getKey().concat(entry.getValue()))
	      .collect(Collectors.toList());
	      
	      
	      System.out.println(map);
		
	}

}
