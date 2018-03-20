import models.RandomNames;
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
        get ("/randomnames", (req, res) -> {
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
            String result = names.add();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result );
            return new ModelAndView(model, "result.vtl");
        },  velocityTemplateEngine);

//        im not sure that add function is what i wanted, tried amending parseString to add name1 and name2 together

        get("/add/:name1/:name2", (Request req, Response res) -> {
            String name1 = String.parseInt(req.params(":name1"));
            String name2 = String.parseInt(req.params(":name2"));
            RandomNames names = new RandomNames(name1, name2);
            String result = names.add();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

    }
}
