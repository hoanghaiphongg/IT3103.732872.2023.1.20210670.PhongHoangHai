package hust.soict.dsai.garbage;
// Hoang Hai Phong - 20210670
import java.util.Random;
public class ConcentrationInLoops {
		public static void main(String[] args) {
			
			// Hoang Hai Phong - 20210670
			Random r = new Random(123);
			long start = System.currentTimeMillis();
			String s = "";
			for(int i=0;i<65536;i++) 
				s +=r.nextInt(2);
				System.out.println(System.currentTimeMillis()-start);
			r = new Random(123);
			start = System.currentTimeMillis();
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<65536;i++)
				sb.append(r.nextInt(2));
			s = sb.toString();
			System.out.println(System.currentTimeMillis()-start);
		}
}
