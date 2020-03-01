package java_prep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class trywithres {

	public static void main(String[] args) {
		try {
			trywithres.test();
		} catch (NumberFormatException | IOException e) {
			
			e.printStackTrace();
		}
}
	public static void test() throws IOException,NumberFormatException {
	try (BufferedReader br = new BufferedReader(new FileReader(
			"C:\\logfile_CC801_14.txt"))) {
		int i=10/0;
		System.out.println(br.readLine());
	} catch (Exception e) {
		//throw e;
	e.printStackTrace();
		System.out.println(e.getClass());
	}
	}
}