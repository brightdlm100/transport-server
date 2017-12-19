package com.hyd.domain.po;

public class ContainerCount {
    private String countid;

    private String companyid;

    private String ctype;

    private String model;

    private String csize;

    private Integer cnumber;

    public String getCountid() {
        return countid;
    }

    public void setCountid(String countid) {
        this.countid = countid == null ? null : countid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getCsize() {
        return csize;
    }

    public void setCsize(String csize) {
        this.csize = csize == null ? null : csize.trim();
    }

    public Integer getCnumber() {
        return cnumber;
    }

    public void setCnumber(Integer cnumber) {
        this.cnumber = cnumber;
    }
}