package co.fullstacklabs.heyurl.entities;

import java.util.Date;

public class Url {
    private String id;
    private String target;
    private Date created_at;

    protected Url() {}

    public Url(String id, String target) {
        this.id = id;
        this.target = target;
        this.created_at = new Date();
    }


    public String getId() {
        return id;
    }

    public String getTarget() {
        return target;
    }

    public Date getCreatedAt() {
        return (Date) created_at.clone();
    }


    @Override
    public String toString() {
        return "Url[" + id + "]";
    }
}
