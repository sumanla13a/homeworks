package lesson10.labs.prob2.bugreporter;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BugReportGenerator brg = new BugReportGenerator();
		try{
			brg.reportGenerator();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
