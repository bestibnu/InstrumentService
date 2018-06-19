package com.ibs.qservice.InstrumentService.jms;

import com.ibs.qservice.InstrumentService.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;

/**
 * Created by Balagan on 5/9/2018.
 */
public class QueueMessageListener {
    @Autowired
    SecurityService securityService;

    @JmsListener(destination = "MARKET_DATA")
    private void receiveMessage(String msg){

        System.out.println("received Message From MarketData::"+msg);
    }



}
