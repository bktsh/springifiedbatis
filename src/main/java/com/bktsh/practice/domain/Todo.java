package com.bktsh.practice.domain;

import java.io.Serializable;

/**
 * Created on 2017-Feb-16
 */
public class Todo implements Serializable {

    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
