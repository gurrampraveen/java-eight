import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str1 = new ArrayList<String>();
		str1.add("Ramu");
		str1.add("Bheem");
		str1.add("Deem");
		System.out.println(str1);
		
		Object[] objStr = str1.toArray();
		System.out.println(Arrays.toString(objStr));
		
		String[] str2 = str1.toArray(new String[0]);
		str2[0] = "delta";
		System.out.println(Arrays.toString(str2));
		System.out.println(str1);

	}

}
