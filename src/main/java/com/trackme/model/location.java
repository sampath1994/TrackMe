package com.trackme.model;

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
    private Integer lat;


    @Column(name = "longt")
    private Integer longt;

    @JoinColumn(name = "slave_id", referencedColumnName = "s_id")
    @ManyToOne
    private Slave slave;

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLongt() {
        return longt;
    }

    public void setLongt(Integer longt) {
        this.longt = longt;
    }

    public Slave getSlave() {
        return slave;
    }

    public void setSlave(Slave slave) {
        this.slave = slave;
    }
}
