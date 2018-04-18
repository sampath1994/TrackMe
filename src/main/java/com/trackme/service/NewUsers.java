package com.trackme.service;

import com.trackme.dto.UserDTO;
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
public class NewUsers {

    @Autowired
    public UsersRepo usersRepo;

    @Autowired
    public MasterRepo masterRepo;

    @Autowired
    public SlaveRepo slaveRepo;

    public String addMaster(UserDTO userDTO)
    {
        User user = new User(userDTO.getUserName(),userDTO.getPassword(),userDTO.getFirstName(),userDTO.getLastName(),userDTO.getTelephone());
        Master master = new Master(usersRepo.save(user).getId());
        masterRepo.save(master);
        return "Master saved success";
    }

    public String addSlave(UserDTO userDTO)
    {
        User user = new User(userDTO.getUserName(),userDTO.getPassword(),userDTO.getFirstName(),userDTO.getLastName(),userDTO.getTelephone());
        Slave slave = new Slave(usersRepo.save(user).getId());
        slaveRepo.save(slave);
        return "Slave saved success";
    }

}
