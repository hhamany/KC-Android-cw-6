package com.example.students;

public class Students {
    private int pics ;
    private String names ;
    private int ages ;
    private int degrees;

    public Students(int pics, String names, int ages, int degrees) {
        this.pics = pics;
        this.names = names;
        this.ages = ages;
        this.degrees = degrees;
    }

    public int getPics() {
        return pics;
    }

    public void setPics(int pics) {
        this.pics = pics;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }
}
