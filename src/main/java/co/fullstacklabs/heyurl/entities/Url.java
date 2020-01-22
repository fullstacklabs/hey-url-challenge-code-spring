package co.fullstacklabs.heyurl.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Url {
    @Id
    private String id;
    private String target;


    protected Url() {}

    public Url(String id, String target) {
        this.id = id;
        this.target = target;
    }


    public String getId() {
        return id;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Url[" + id + "]";
    }
}
