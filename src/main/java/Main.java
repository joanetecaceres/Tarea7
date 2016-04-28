import Controller.Controller;
import Model.Result;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.util.List;
import static spark.Spark.get;

/**
 *
 * @author Carolina Caceres
 */
public class Main {

   /**
     * Main method, where the endpoints are defined
     * 
     * @param args
     */
  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    
    get("/calculations", (req, res) -> {
        
        final String FILE_NAME_1 = "result1.txt";
        final String FILE_NAME_2 = "result2.txt";
        final String FILE_NAME_3 = "result3.txt";
        final String FILE_NAME_4 = "result4.txt";
        final String[] FILE_NAMES = {FILE_NAME_1, FILE_NAME_2, FILE_NAME_3, FILE_NAME_4};
        
        List<Result> data = new ArrayList<>();
        Controller controller = new Controller();
        
        for(String fileName : FILE_NAMES) {
            data = controller.loadClassInfo(fileName);
        }
        
        return controller.showAnswer(data);
    });

  }
}
