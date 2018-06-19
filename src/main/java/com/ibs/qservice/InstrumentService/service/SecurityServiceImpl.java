package com.ibs.qservice.InstrumentService.service;

import com.ibs.qservice.InstrumentService.enums.SecurityServiceStatus;
import com.ibs.qservice.InstrumentService.model.SecurityServiceBean;
import com.ibs.qservice.InstrumentService.repository.SecurityServiceRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Balagan on 5/9/2018.
 */
public class SecurityServiceImpl implements SecurityService{


   // private static final Logger LOG = Logger.getLogger(SecurityServiceImpl.class);

    @Autowired
    SecurityServiceRepository securityServiceRepository;


    @Override
     public void readMessageFromQueue(String requestMsg){

        SecurityServiceBean entity = new SecurityServiceBean();
        entity.setReqMsg(requestMsg);
        entity.setRegStatus(SecurityServiceStatus.NEW.toString());;
        securityServiceRepository.save(entity);

    }



}
