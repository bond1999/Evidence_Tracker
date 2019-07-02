package com.gpsi.evidencetracker;

public class Evidence {
    private String name_of_io;
    private String badge_number;
    private String timestamp;
    private String description;

    public Evidence() {
    }

    public Evidence(String name_of_io, String badge_number, String timestamp, String description) {
        this.name_of_io = name_of_io;
        this.badge_number = badge_number;
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getName_of_io() {
        return name_of_io;
    }

    public String getBadge_number() {
        return badge_number;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setName_of_io(String name_of_io) {
        this.name_of_io = name_of_io;
    }

    public void setBadge_number(String badge_number) {
        this.badge_number = badge_number;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
