/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import config.SaveDataAPI;
import config.WebClientConfig;
import java.io.IOException;
import java.net.ProtocolException;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.POST;
import model.TimelineCaseByProvinces;

/**
 *
 * @author User
 */
@WebService(serviceName = "ConvidService")
public class ConvidService {

    WebClientConfig config;

    SaveDataAPI dataAPI;

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "timeline")
    public List<TimelineCaseByProvinces> timelistCaseByPrivinces() {
        config = new WebClientConfig();
        return config.timelineCaseByProvinceses();
    }

    @WebMethod(operationName = "dataAPI")
    public String saveDataAPI() {

        dataAPI = new SaveDataAPI();
        dataAPI.getDataAPIFromDB();
        return "SUCCESS";
    }

    @WebMethod(operationName = "getData")
    public List<TimelineCaseByProvinces> getDataAPI() {
        dataAPI = new SaveDataAPI();
        return dataAPI.getCaseTimelineProvinces();
    }
}
