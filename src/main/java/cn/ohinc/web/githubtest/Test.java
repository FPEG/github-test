package cn.ohinc.web.githubtest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    private Long id;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
