package de.rok_aachen.rest.json;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Links {
    @SerializedName("self")
    private List<Self> self;
    @SerializedName("collection")
    private List<Collection> collection;
    @SerializedName("about")
    private List<About> about;
    @SerializedName("author")
    private List<Author> author;
    @SerializedName("replies")
    private List<Reply> replies;
    @SerializedName("version-history")
    private List<VersionHistory> versionHistory;
    @SerializedName("predecessor-version")
    private List<PredecessorVersion> predecessorVersion;
    @SerializedName("wp:attachment")
    private List<WpAttachment> wpAttachment;
    @SerializedName("curies")
    private List<Cury> curies;

    public List<Self> getSelf() {
        if(self == null){
            this.self = new ArrayList<>();
        }

        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public List<Collection> getCollection() {
        if(collection == null){
            this.collection = new ArrayList<Collection>();
        }
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public List<About> getAbout() {
        if(about == null){
            this.about = new ArrayList<About>();
        }

        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public List<Author> getAuthor() {
        if(author == null){
            this.author = new ArrayList<Author>();
        }

        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<Reply> getReplies() {
        if(replies == null){
            this.replies = new ArrayList<Reply>();
        }

        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public List<VersionHistory> getVersionHistory() {
        if(versionHistory == null){
            this.versionHistory = new ArrayList<VersionHistory>();
        }

        return versionHistory;
    }

    public void setVersionHistory(List<VersionHistory> versionHistory) {
        this.versionHistory = versionHistory;
    }

    public List<PredecessorVersion> getPredecessorVersion() {
        if(predecessorVersion == null){
            this.predecessorVersion = new ArrayList<PredecessorVersion>();
        }

        return predecessorVersion;
    }

    public void setPredecessorVersion(List<PredecessorVersion> predecessorVersion) {
        this.predecessorVersion = predecessorVersion;
    }

    public List<WpAttachment> getWpAttachment() {
        if(wpAttachment == null){
            this.wpAttachment = new ArrayList<WpAttachment>();
        }
        return wpAttachment;
    }

    public void setWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
    }

    public List<Cury> getCuries() {
        if(curies == null){
            this.curies = new ArrayList<Cury>();
        }
        return curies;
    }

    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    @Override
    public String toString() {
        return "Links{" +
                "self=" + ((self == null) ? "null" : "not null") +
                ", collection=" + ((collection == null) ? "null" : "not null") +
                ", about=" + ((about == null) ? "null" : "not null") +
                ", author=" + ((author == null) ? "null" : "not null") +
                ", replies=" + ((replies) == null ? "null" : "not null") +
                ", versionHistory=" + ((versionHistory == null) ? "null" : "not null") +
                ", predecessorVersion=" + ((predecessorVersion == null) ? "null" : "not null") +
                ", wpAttachment=" + ((wpAttachment == null) ? "null" : "not null") +
                ", curies=" + ((curies == null) ? "null" : "not null") +
                '}';
    }
}
