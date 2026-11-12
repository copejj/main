package com.braindribbler.main.models;

public class SiteLink {
    private String name;
    private String url;
    private String description;
    private String gitHubUrl;

    public SiteLink(String name, String url, String description) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.gitHubUrl = ""; 
    }

    public SiteLink(String name, String url, String description, String gitHubUrl) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.gitHubUrl = gitHubUrl; 
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }
}
