package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class VersionHistory{
    @SerializedName("count")
    private int count;
    @SerializedName("href")
    private String href;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "VersionHistory{" +
                "count=" + count +
                ", href='" + href + '\'' +
                '}';
    }
}
