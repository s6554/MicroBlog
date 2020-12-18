import static spark.Spark.*;
import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;

public class MicroBlog {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		get("/hello", (req, res) -> "Hello World");
	}

}
