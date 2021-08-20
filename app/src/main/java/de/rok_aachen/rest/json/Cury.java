package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class Cury{
    @SerializedName("name")
    private String name;
    @SerializedName("href")
    private String href;
    @SerializedName("templated")
    private boolean templated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isTemplated() {
        return templated;
    }

    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

    @Override
    public String toString() {
        return "Cury{" +
                "name='" + name + '\'' +
                ", href='" + href + '\'' +
                ", templated=" + templated +
                '}';
    }
}
