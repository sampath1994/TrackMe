package com.trackme.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by promod on 4/5/2018.
 */
@Entity
@Table(name = "location",schema = "public")
public class location implements Serializable{

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Id
    @Column(name = "l_id")
    private Integer l_id;


    @Column(name = "lat")
    private String lat;


    @Column(name = "longt")
    private String longt;

    @JoinColumn(name = "slave_id", referencedColumnName = "s_id")
    @ManyToOne
    @JsonIgnore
    private Slave slave;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongt() {
        return longt;
    }

    public void setLongt(String longt) {
        this.longt = longt;
    }

    public Slave getSlave() {
        return slave;
    }

    public void setSlave(Slave slave) {
        this.slave = slave;
    }
}
