package com.trackme.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by promod on 4/5/2018.
 */
@Entity
@Table(name = "slave",schema = "public")
public class Slave implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "s_id")
    private Integer s_id;

    @JoinColumn(name = "master_id", referencedColumnName = "m_id")
    @ManyToOne
    private Master master;


    @OneToMany(mappedBy = "slave")
    private List<location> locationList;


    public Slave(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public List<location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<location> locationList) {
        this.locationList = locationList;
    }
}