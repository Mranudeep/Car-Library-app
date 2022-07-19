package com.example.carlibrary;

public class CarslistObject {
    private  String carbrand,fueltype,color;
    int carimage;

    public CarslistObject(String carbrand, String fueltype, String color, int carimage) {
        this.carbrand = carbrand;
        this.fueltype = fueltype;
        this.color = color;
        this.carimage = carimage;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarimage() {
        return carimage;
    }

    public void setCarimage(int carimage) {
        this.carimage = carimage;
    }
}
