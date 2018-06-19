package com.ibs.qservice.InstrumentService.routes;

import org.apache.camel.builder.RouteBuilder;


/**
 * Created by Balagan on 5/9/2018.
 */
public class SecurityServiceRoutes extends RouteBuilder {

    private String amdhResponseQueue;

    private String marketDataQueue;

    private String marketData;


    public void configure() throws Exception {


        from("jms:queue" + amdhResponseQueue).choice()
                .when(xpath("filterCriteria"+marketData)).log("Reading request msg from the queue for ::"+marketData);
    }


}
