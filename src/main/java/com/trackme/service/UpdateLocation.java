package com.trackme.service;

import com.trackme.model.Slave;
import com.trackme.model.User;
import com.trackme.model.location;
import com.trackme.repository.LocationRepo;
import com.trackme.repository.SlaveRepo;
import com.trackme.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by promod on 4/18/2018.
 */
@Service
public class UpdateLocation {

    @Autowired
    public UsersRepo usersRepo;

    @Autowired
    public SlaveRepo slaveRepo;

    @Autowired
    public LocationRepo locationRepo;

    public String update(String username,String lat,String longt)
    {
        User user = usersRepo.findUserByUsername(username);
        if(user == null)
        {
            return "No such user!";
        }
        Slave slave = slaveRepo.findOne(user.getId());

        slave.setLat(lat);
        slave.setLongt(longt);

        location loc =new location();
                loc.setLat(lat);
                loc.setLongt(longt);

        slave.addLocation(loc);
        locationRepo.save(loc);
        slaveRepo.save(slave);
        return "update success";

    }
}
