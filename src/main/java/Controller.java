import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

//        i have added an arraylist of names but im not sure how this will work with a hashmap,
//        check with instructors. i thought the shuffle would give the random names that i need.
//        i have added to $result to the result.vtl file.
        get ("/randomname", (Request req, Response res) -> {
            ArrayList<String> names = new ArrayList<>();
            names.add("Emma");
            names.add("Jean");
            names.add("Christie");
            names.add("Ellie");
            names.add("Sarah");
            names.add("Ria");
            names.add("Debbie");
            names.add("Victor");
            names.add("Jim");
            names.add("Graeme");
            names.add("Chris");
            names.add("Jay");
            names.add("Young Danny");
            names.add("Older Danny");
            names.add("Angus");
            names.add("Ed");
            names.add("Paul");
            names.add("Steven");
            Collections.shuffle(names);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        },  velocityTemplateEngine);

    }
}
