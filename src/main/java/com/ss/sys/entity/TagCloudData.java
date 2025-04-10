package com.ss.sys.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
@Getter
public class TagCloudData {
        @Getter
        @JsonProperty("name")
        private String name;

        @JsonProperty("value")
        private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TagCloudData(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
