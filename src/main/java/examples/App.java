package examples;

import java.io.*;
import org.json.*;
import java.util.*;

//http://stleary.github.io/JSON-java/org/json/JSONObject.html

class App {
	public static void main(String[] args) {
		String filename1 = args.length > 0 ? args[0] : "input.json";
		String home = System.getProperty("user.home");
		File filename2 = new File(home, "output.json");
		if(args.length > 1)filename2 = new File(args[1]);

		try (BufferedReader br = new BufferedReader(new FileReader(filename1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(filename2))) {
			JSONTokener t = new JSONTokener(br);
			JSONObject data = new JSONObject(t);

			data.write(bw, 1, 0);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}
