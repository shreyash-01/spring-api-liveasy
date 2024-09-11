package com.example.springapiliveasy.model;


import jakarta.persistence.*;

@Entity
@Table(name = "load")
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence")
    @SequenceGenerator(name = "my_sequence", sequenceName = "load_seq", allocationSize = 1)
    @Column(name = "loadid")
    private int loadID;

    @Column(name = "loadingpoint")
    private String loadingPoint;

    @Column(name = "unloadingpoint")
    private String unloadingPoint;

    @Column(name = "producttype")
    private String productType;

    @Column(name = "trucktype")
    private String truckType;

    @Column(name = "nooftrucks")
    private int noOfTrucks;

    @Column(name = "weight")
    private int weight;

    @Column(name = "comment")
    private String comment;

    @Column(name = "shipperid")
    private String shipperId;

    @Column(name = "date")
    private String date;


    public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String comment, String shipperId, String date) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }



    public Load() {

    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public int getLoadID() {
        return loadID;
    }

    public void setLoadID(int loadID) {
        this.loadID = loadID;
    }

    @Override
    public String toString() {
        return "Load{" +
                "loadID='" + loadID + '\'' +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType=" + productType +
                ", truckType=" + truckType +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", shipperId='" + shipperId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
