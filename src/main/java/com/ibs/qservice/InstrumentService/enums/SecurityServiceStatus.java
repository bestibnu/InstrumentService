package com.ibs.qservice.InstrumentService.enums;

/**
 * Created by Balagan on 4/23/2018.
 */
public enum SecurityServiceStatus {
    NEW, IN_PROGRESS,COMPLETED;

    private String value;

    public String getValue(){
        return value;
    }
}
