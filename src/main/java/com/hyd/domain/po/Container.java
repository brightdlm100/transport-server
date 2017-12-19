package com.hyd.domain.po;

public class Container {
    private String containerid;

    private String shiporderid;

    private Integer driverid;

    private String model;

    private String ctype;

    private String csize;

    public String getContainerid() {
        return containerid;
    }

    public void setContainerid(String containerid) {
        this.containerid = containerid == null ? null : containerid.trim();
    }

    public String getShiporderid() {
        return shiporderid;
    }

    public void setShiporderid(String shiporderid) {
        this.shiporderid = shiporderid == null ? null : shiporderid.trim();
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getCsize() {
        return csize;
    }

    public void setCsize(String csize) {
        this.csize = csize == null ? null : csize.trim();
    }
}