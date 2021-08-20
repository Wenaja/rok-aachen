package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class Author{
    @SerializedName("embeddable")
    private boolean embeddable;
    @SerializedName("href")
    private String href;

    public boolean isEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Author{" +
                "embeddable=" + embeddable +
                ", href='" + href + '\'' +
                '}';
    }
}
