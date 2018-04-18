package com.trackme.service;

import com.trackme.model.Master;
import com.trackme.model.Slave;
import com.trackme.model.User;
import com.trackme.repository.MasterRepo;
import com.trackme.repository.SlaveRepo;
import com.trackme.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by promod on 4/18/2018.
 */
@Service
public class ConnectMaster{

    @Autowired
    public MasterRepo masterRepo;

    @Autowired
    public SlaveRepo slaveRepo;

    @Autowired
    public UsersRepo usersRepo;

    public String ConnectMastertoSlave(String SlaveUsername,String MasterUsername)
    {
        User MasterUser = usersRepo.findUserByUsername(MasterUsername);
        User SlaveUser = usersRepo.findUserByUsername(SlaveUsername);

        if(MasterUser == null || SlaveUser == null )
        {
            return "NO such Master or Slave";
        }

        Master master = masterRepo.findOne(MasterUser.getId());
        Slave slave = slaveRepo.findOne(SlaveUser.getId());

        master.addSlave(slave);
        slaveRepo.save(slave);
        return "Connection Success";
    }
}
