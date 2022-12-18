/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.TimelineCaseByProvinces;

/**
 *
 * @author User
 */
public class WebClientConfig {
    
    public List<TimelineCaseByProvinces> timelineCaseByProvinceses(){
        
        List<TimelineCaseByProvinces> dataList = new ArrayList<>();
        try {
            // Set the API endpoint URL
            URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/timeline-cases-by-provinces");

            // Create an HTTP connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set the HTTP method (GET, POST, PUT, etc.)
            conn.setRequestMethod("GET");

            // Set any additional headers, if necessary
            conn.setRequestProperty("Content-Type", "application/json");

            // Send the request and retrieve the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Parse the JSON response into an object
            Gson gson = new Gson();
            
            java.lang.reflect.Type listType = new TypeToken<List<TimelineCaseByProvinces>>() {
            }.getType();
            
             dataList = gson.fromJson(response.toString(), listType);
            
            // Use the object as needed
            System.out.println(dataList.get(0).getYear());
//            System.out.println(data.getNew_death());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dataList;
    }


}
