package com.hyd.domain.po;

import java.util.Date;

public class TOrder {
    private String shiporderid;

    private String companyid;

    private Integer customerid;

    private String revertloc;

    private String voyage;

    private String serviceTerm;

    private Date etd;

    private Date eta;

    private Date cyOpeningDate;

    private Date siCutoffDate;

    private Date cyClosingDate;

    private String commodity;

    private String receiptPlace;

    private String lodingPort;

    private String dischangePort;

    private String deliveryPlace;

    public String getShiporderid() {
        return shiporderid;
    }

    public void setShiporderid(String shiporderid) {
        this.shiporderid = shiporderid == null ? null : shiporderid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getRevertloc() {
        return revertloc;
    }

    public void setRevertloc(String revertloc) {
        this.revertloc = revertloc == null ? null : revertloc.trim();
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage == null ? null : voyage.trim();
    }

    public String getServiceTerm() {
        return serviceTerm;
    }

    public void setServiceTerm(String serviceTerm) {
        this.serviceTerm = serviceTerm == null ? null : serviceTerm.trim();
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getCyOpeningDate() {
        return cyOpeningDate;
    }

    public void setCyOpeningDate(Date cyOpeningDate) {
        this.cyOpeningDate = cyOpeningDate;
    }

    public Date getSiCutoffDate() {
        return siCutoffDate;
    }

    public void setSiCutoffDate(Date siCutoffDate) {
        this.siCutoffDate = siCutoffDate;
    }

    public Date getCyClosingDate() {
        return cyClosingDate;
    }

    public void setCyClosingDate(Date cyClosingDate) {
        this.cyClosingDate = cyClosingDate;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity == null ? null : commodity.trim();
    }

    public String getReceiptPlace() {
        return receiptPlace;
    }

    public void setReceiptPlace(String receiptPlace) {
        this.receiptPlace = receiptPlace == null ? null : receiptPlace.trim();
    }

    public String getLodingPort() {
        return lodingPort;
    }

    public void setLodingPort(String lodingPort) {
        this.lodingPort = lodingPort == null ? null : lodingPort.trim();
    }

    public String getDischangePort() {
        return dischangePort;
    }

    public void setDischangePort(String dischangePort) {
        this.dischangePort = dischangePort == null ? null : dischangePort.trim();
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace == null ? null : deliveryPlace.trim();
    }
}