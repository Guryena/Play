package Play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		
		
		int result;
		List<Integer> t = new ArrayList<>();
		int n = 0;
		for (int i = 1; i<100; i++) {
			if (i%2==1) {
				Random random = new Random();
				if (random.nextBoolean()==true) {
					x1++;
				}
				else if (random.nextBoolean()==false) {
					y2++;
				}
			}
			
			else if (i%2 ==0) {
				Random random = new Random();
				if (random.nextBoolean()==true) {
					y1++;
				}
				else if (random.nextBoolean()==false) {
					x2++;
				}
			}
			result = x1*x2+y1*y2;
			if (result >= 150) {
				t.add(i);
				n = i;
				System.out.println(n);
				System.out.println(Collections.min(t));
				break;
			}
			
		}
	}

}
