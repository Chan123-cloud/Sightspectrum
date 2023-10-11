package week6task3;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferReaderUserInput {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);// before 1.5 user input method
		int d = Integer.parseInt(b.readLine());
		b.close();// want to close the resources
		System.out.println(d);

	}

}
