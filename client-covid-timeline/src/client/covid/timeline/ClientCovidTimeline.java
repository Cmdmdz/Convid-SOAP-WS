/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.covid.timeline;

/**
 *
 * @author User
 */
public class ClientCovidTimeline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < getData().size(); i++) {
            System.out.println(getData().get(i).getYear());
            System.out.println(getData().get(i).getWeeknum());
        }
    }
    
    // get data from database 
    private static java.util.List<services.TimelineCaseByProvinces> getData() {
        services.ConvidService_Service service = new services.ConvidService_Service();
        services.ConvidService port = service.getConvidServicePort();
        return port.getData();
    }
    
    // save save from API 
    private static String dataAPI() {
        services.ConvidService_Service service = new services.ConvidService_Service();
        services.ConvidService port = service.getConvidServicePort();
        return port.dataAPI();
    }

    //calling data API covid
    private static java.util.List<services.TimelineCaseByProvinces> timeline() {
        services.ConvidService_Service service = new services.ConvidService_Service();
        services.ConvidService port = service.getConvidServicePort();
        return port.timeline();
    }
    
    
    
    
    
    
}
