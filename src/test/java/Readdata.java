import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Readdata {

    String json = "{\n" +
            "  \"pageInfo\": {\n" +
            "    \"pageName\": \"Homepage\",\n" +
            "    \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "  },\n" +
            "  \"posts\": [\n" +
            "    {\n" +
            "      \"post_id\": \"0123456789\",\n" +
            "      \"actor_id\": \"1001\",\n" +
            "      \"author_name\": \"Jane Doe\",\n" +
            "      \"post_title\": \"How to parse JSON in Java\",\n" +
            "      \"comments\": [],\n" +
            "      \"time_of_post\": \"1234567890\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    @Test
    void parseJsonData(){

        JsonObject jsonObject = new JsonParser().
                                parse(json).getAsJsonObject();

        String pagename = jsonObject.getAsJsonObject("pageInfo").get("pageName").getAsString();

        System.out.println(pagename);

        JsonArray jsonArray = jsonObject.getAsJsonArray("posts");

        for(int i=0;i<jsonArray.size();i++)
        {
            String postid = jsonArray.get(i).getAsJsonObject().get("post_id").getAsString();
            System.out.println(postid);
        }

    }

    @Test
    void readJsonData() throws Exception
    {
        JsonObject obj =(JsonObject) new JsonParser().parse(new FileReader("/Users/vishnupatlolla/IdeaProjects/ThemisProj/TestNg/src/test/resources/data/data.json"));

        String p  =obj.getAsJsonObject("pageInfo").get("pageName").getAsString();

        System.out.println(p+" is message");

    }

    @Test
    void writeData() throws Exception{

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","vishnu");
        jsonObject.addProperty("age","25");

        JSONObject jb = new JSONObject();

        jb.put("name","vishnu");


        Map m = new HashMap<String,String>();
        m.put("postal code","M1T1H8");
        m.put("city","Toronto");
        m.put("Country","Cana");

        jb.put("address",m);

//        jsonObject.addProperty("address", m);

        JSONArray ja = new JSONArray();


        JsonArray jar = new JsonArray();
        m = new LinkedHashMap(2);

        m.put("type","home");
        m.put("num",123);

//        jar.add((JsonElement) m);
        ja.add(m);

        m = new LinkedHashMap(2);

        m.put("type","mobile");
        m.put("num",789);
//        jar.add((JsonElement) m);
        ja.add(m);


        jb.put("phones",ja);

        jsonObject.add("phones",jar);

        System.out.println(jb.toString());

        PrintWriter pw = new PrintWriter("test.json");

        pw.write(jb.toString());
        pw.flush();
        pw.close();





    }
}
