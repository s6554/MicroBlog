import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.BasicConfigurator;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class MicroBlog {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		get("/kkkk", (reqest, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("message", "Hello World");
			
			return new ModelAndView(attributes, "hello.ftl");
		}, new FreeMarkerEngine());
	}

}
