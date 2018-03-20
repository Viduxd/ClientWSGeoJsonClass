package clientwsgeojsonclass;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;




public class ClientWSGeoJsonClass {

    public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
        URL client = new URL("http://services.groupkt.com/country/get/iso2code/IN");
        URLConnection tc = client.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(tc.getInputStream()));
        
        String rest = new String();
        String line;
        while((line=in.readLine())!=null) {
            rest += line;
        }
        System.out.println("Respuesta del servidor: "+rest);
        in.close();
        
        JSONObject obj = new JSONObject(rest);
        System.out.println("Json_object: " + obj);
        JSONObject res = obj.getJSONObject("RestResponse").getJSONObject("result");
        System.out.println("res: "+res);
        
        String r1 = res.toString();
        System.out.println("r1: "+r1);
        
        Gson gson = new Gson();
        Country country = (Country) gson.fromJson(r1, Country.class);
        System.out.println(country.getName());
        System.out.println(country.getAlpha2_code());
        System.out.println(country.getAlpha3_code());
        
    }
}
