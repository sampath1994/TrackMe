package com.trackme.service;

import com.trackme.model.Master;
import com.trackme.model.Slave;
import com.trackme.model.User;
import com.trackme.repository.MasterRepo;
import com.trackme.repository.SlaveRepo;
import com.trackme.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by promod on 4/10/2018.
 */
@Service
public class allSlaveLocations {

    @Autowired
    public UsersRepo usersRepo;

    @Autowired
    public MasterRepo masterRepo;

    @Autowired
    public SlaveRepo slaveRepo;

    public Slave[] getMySlaves(String username){

        User user = usersRepo.findUserByUsername(username);
        Master master = masterRepo.findOne(user.getId());
        List<Slave> slaveList = master.getSlaveList();
        Slave[] slaves =  slaveList.toArray(new Slave[slaveList.size()]);
        return slaves;
    }
}
