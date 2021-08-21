package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

public class Content {
    private String rendered;
    @SerializedName("protected")
    private boolean protect;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public boolean isProtect() {
        return protect;
    }

    public void setProtect(boolean protect) {
        this.protect = protect;
    }

    @Override
    public String toString() {
        return "Content{" +
                "rendered='" + rendered + '\'' +
                ", protect=" + protect +
                '}';
    }
}
