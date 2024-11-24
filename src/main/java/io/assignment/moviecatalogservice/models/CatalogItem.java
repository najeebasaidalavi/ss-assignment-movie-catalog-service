package io.assignment.moviecatalogservice.models;

public class CatalogItem {
    private String name;
    private String desc;
    private int rating;

    private String descRating;

    public CatalogItem(){}

    public CatalogItem(String name, String desc, int rating, String descRating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.descRating = descRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescRating() {
        return descRating;
    }

    public void setDescRating(String descRating) {
        this.descRating = descRating;
    }
}
