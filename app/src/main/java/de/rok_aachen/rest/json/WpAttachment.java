package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class WpAttachment{
    @SerializedName("href")
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "WpAttachment{" +
                "href='" + href + '\'' +
                '}';
    }
}
