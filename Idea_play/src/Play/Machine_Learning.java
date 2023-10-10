package Play;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Machine_Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value = new ArrayList<>();
		int x = 50;
		boolean t = true;
		int count = 0;
		while (t) {
			for (int i = 0; i < x; i++) {
				Random random = new Random();
				value.add(random.nextInt());

			}
			for (int j = 0; j < value.size() - 1; j++) {
				if (value.get(j) >= value.get(j + 1)) {
					count++;
					break;
				}
				if (value.get(value.size()-2) < value.get(value.size()-1)) {
					System.out.println(value);
					System.out.println(count);
					t = false;
					
				}
				
			}

		}

	}

}
