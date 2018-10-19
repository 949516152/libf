package com.libf.model;

public class StudentTest {
    private String name;

    private String scores;

    private String subname;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores == null ? null : scores.trim();
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}