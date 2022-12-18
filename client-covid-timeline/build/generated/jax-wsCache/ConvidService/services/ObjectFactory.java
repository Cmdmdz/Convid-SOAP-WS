
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Timeline_QNAME = new QName("http://services/", "timeline");
    private final static QName _GetData_QNAME = new QName("http://services/", "getData");
    private final static QName _DataAPIResponse_QNAME = new QName("http://services/", "dataAPIResponse");
    private final static QName _DataAPI_QNAME = new QName("http://services/", "dataAPI");
    private final static QName _GetDataResponse_QNAME = new QName("http://services/", "getDataResponse");
    private final static QName _TimelineResponse_QNAME = new QName("http://services/", "timelineResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataAPI }
     * 
     */
    public DataAPI createDataAPI() {
        return new DataAPI();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link TimelineResponse }
     * 
     */
    public TimelineResponse createTimelineResponse() {
        return new TimelineResponse();
    }

    /**
     * Create an instance of {@link DataAPIResponse }
     * 
     */
    public DataAPIResponse createDataAPIResponse() {
        return new DataAPIResponse();
    }

    /**
     * Create an instance of {@link Timeline }
     * 
     */
    public Timeline createTimeline() {
        return new Timeline();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link TimelineCaseByProvinces }
     * 
     */
    public TimelineCaseByProvinces createTimelineCaseByProvinces() {
        return new TimelineCaseByProvinces();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timeline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "timeline")
    public JAXBElement<Timeline> createTimeline(Timeline value) {
        return new JAXBElement<Timeline>(_Timeline_QNAME, Timeline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataAPIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "dataAPIResponse")
    public JAXBElement<DataAPIResponse> createDataAPIResponse(DataAPIResponse value) {
        return new JAXBElement<DataAPIResponse>(_DataAPIResponse_QNAME, DataAPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataAPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "dataAPI")
    public JAXBElement<DataAPI> createDataAPI(DataAPI value) {
        return new JAXBElement<DataAPI>(_DataAPI_QNAME, DataAPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimelineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "timelineResponse")
    public JAXBElement<TimelineResponse> createTimelineResponse(TimelineResponse value) {
        return new JAXBElement<TimelineResponse>(_TimelineResponse_QNAME, TimelineResponse.class, null, value);
    }

}
