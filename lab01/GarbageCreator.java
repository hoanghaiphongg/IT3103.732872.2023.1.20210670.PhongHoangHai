package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// Hoang Hai Phong - 20210670
public class GarbageCreator {
		public static void main(String[] args) throws IOException {
			String filename = "C:\\Users\\PhongHoang\\eclipse-workspace\\Java_17\\src\\test.java";
			byte[] inputBytes= {0};
			long startTime,endTime;
			inputBytes = Files.readAllBytes(Paths.get(filename));
			startTime = System.currentTimeMillis();
			String outputString = "";
			for(byte b : inputBytes) {
				outputString += (char) b;
			}
			endTime = System.currentTimeMillis();
			System.out.println(endTime-startTime);
		}
}
