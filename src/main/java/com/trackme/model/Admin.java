package com.trackme.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by promod on 4/5/2018.
 */
@Entity
@Table(name = "admin",schema = "public")
public class Admin implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "a_id")
    private Integer a_id;

    public Admin(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }
}
