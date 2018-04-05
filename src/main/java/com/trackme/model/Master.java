package com.trackme.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by promod on 4/5/2018.
 */
@Entity
@Table(name = "master",schema = "public")
public class Master implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "m_id")
    private Integer m_id;

    @OneToMany(mappedBy = "master")
    private List<Slave> slaveList;


    public Master(Integer m_id) {
        this.m_id = m_id;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public List<Slave> getSlaveList() {
        return slaveList;
    }

    public void setSlaveList(List<Slave> slaveList) {
        this.slaveList = slaveList;
    }
}
