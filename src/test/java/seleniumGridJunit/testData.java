package seleniumGridJunit;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class testData {
    JSONParser jsonParser = new JSONParser();
    FileReader fileReader;
    public List jsonreader() {
        {
            try {
                Object obj = jsonParser.parse(new FileReader("C:\\Users\\Piotrek\\IdeaProjects\\untitled\\src\\test\\java\\seleniumGridJunit\\TestCases\\test.json"));
                JSONObject jsonObject = (JSONObject) obj;

                String url = (String) jsonObject.get("url");
                String test = (String) jsonObject.get("testowyString");
                List danetestowe = new ArrayList();
                danetestowe.add(url);
                danetestowe.add(test);
                return danetestowe;

            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
