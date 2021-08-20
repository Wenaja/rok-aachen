package de.rok_aachen.rest.json;

public class Guid {
    private String rendered;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    @Override
    public String toString() {
        return "Guid{" +
                "rendered='" + rendered + '\'' +
                '}';
    }
}
