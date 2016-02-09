import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.JButton;


public class exampleLambda {

	public static void main(String[] args) {
		
		List<String >features = Arrays.asList("Lambdas","Default Method", "StreamAPI", "Date and Time API");
		//for (String feature: features) {
		//	System.out.println(feature);
		features.forEach(n -> System.out.println(n));
		features.forEach(System.out::println);
		}
		
	}

