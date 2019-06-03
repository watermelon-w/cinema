package com.cskaoyan.cinemaproject.bean;

public class mtimeFilmInfo {
    private Integer uuid;

    private String filmId;

    private String filmEnName;

    private String filmScore;

    private Integer filmScoreNum;

    private Integer filmLength;

    private Integer directorId;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId == null ? null : filmId.trim();
    }

    public String getFilmEnName() {
        return filmEnName;
    }

    public void setFilmEnName(String filmEnName) {
        this.filmEnName = filmEnName == null ? null : filmEnName.trim();
    }

    public String getFilmScore() {
        return filmScore;
    }

    public void setFilmScore(String filmScore) {
        this.filmScore = filmScore == null ? null : filmScore.trim();
    }

    public Integer getFilmScoreNum() {
        return filmScoreNum;
    }

    public void setFilmScoreNum(Integer filmScoreNum) {
        this.filmScoreNum = filmScoreNum;
    }

    public Integer getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(Integer filmLength) {
        this.filmLength = filmLength;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }
}