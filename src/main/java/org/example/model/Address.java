package org.example.model;

/**
 * @author chankokwai
 * @project SimpleJavaAppForAutomate
 * @date 4/7/24
 */
public class Address {

    private String blkNum;
    private int storey;
    private int unitNum;
    private String street;
    private int zipCode;

    public String getBlkNum() {
        return blkNum;
    }

    public void setBlkNum(String blkNum) {
        this.blkNum = blkNum;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }

    public int getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(int unitNum) {
        this.unitNum = unitNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
