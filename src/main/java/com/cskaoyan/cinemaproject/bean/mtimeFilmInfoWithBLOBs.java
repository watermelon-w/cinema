package com.cskaoyan.cinemaproject.bean;

public class mtimeFilmInfoWithBLOBs extends mtimeFilmInfo {
    private String biography;

    private String filmImgs;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography == null ? null : biography.trim();
    }

    public String getFilmImgs() {
        return filmImgs;
    }

    public void setFilmImgs(String filmImgs) {
        this.filmImgs = filmImgs == null ? null : filmImgs.trim();
    }
}