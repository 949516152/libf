package com.libf.filter.entry;

public class Regular {

    private int id;

    private String name;

    private String condition;

    public Regular(int id, String name, String condition) {
        this.id = id;
        this.name = name;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
