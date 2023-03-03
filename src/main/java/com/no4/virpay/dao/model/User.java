package com.no4.virpay.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private String id;

    private String name;

    private Integer sex;

    private String address;

    private String email;

    private Date creattime;

    private BigDecimal accountamt;

    private Date motifytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public BigDecimal getAccountamt() {
        return accountamt;
    }

    public void setAccountamt(BigDecimal accountamt) {
        this.accountamt = accountamt;
    }

    public Date getMotifytime() {
        return motifytime;
    }

    public void setMotifytime(Date motifytime) {
        this.motifytime = motifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", creattime=").append(creattime);
        sb.append(", accountamt=").append(accountamt);
        sb.append(", motifytime=").append(motifytime);
        sb.append("]");
        return sb.toString();
    }
}