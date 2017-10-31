
import static spark.Spark.*;

public class democookie {
    public static void main(String[] args) {
       
        get("/hello", (req, res) ->   
        {
            System.out.println(req.cookie("inicio"));
            
            return "inicio";
       
        }
        );
        
        get("/", (request, response) -> {
            
            response.cookie("inicio", "nombre");
            //response.removeCookie("inicio");      
            return "hola monstro";
            
          });
        
       
    }
}