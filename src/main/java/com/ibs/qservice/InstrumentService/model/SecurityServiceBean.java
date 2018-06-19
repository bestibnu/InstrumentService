package com.ibs.qservice.InstrumentService.model;

import javax.persistence.*;

/**
 * Created by Balagan on 5/9/2018.
 */
@Entity
@Table(name = "SECURITY_SERVICE_REQUEST")
public class SecurityServiceBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQURITY_SERV_SEQ")
    private Long id;

    @Column(name = "REQ_STATUS")
    private String regStatus;

    @Column(name = "REQ_MSG")
    private String reqMsg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }
}
