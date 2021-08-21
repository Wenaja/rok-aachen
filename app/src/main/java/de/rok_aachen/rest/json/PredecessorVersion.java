package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class PredecessorVersion{
    @SerializedName("id")
    public int id;
    @SerializedName("href")
    public String href;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "PredecessorVersion{" +
                "id=" + id +
                ", href='" + href + '\'' +
                '}';
    }
}
