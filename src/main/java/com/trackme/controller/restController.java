package com.trackme.controller;

import com.trackme.dto.GPStrack;
import com.trackme.dto.UserDTO;
import com.trackme.model.Slave;
import com.trackme.service.ConnectMaster;
import com.trackme.service.NewUsers;
import com.trackme.service.UpdateLocation;
import com.trackme.service.allSlaveLocations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by promod on 4/5/2018.
 */
@RestController
public class restController {

    @RequestMapping("/locUpdate/{username}/{lat}/{longt}")
    public String LocationUpdate(@PathVariable String username, @PathVariable String lat, @PathVariable String longt){

        String var = "Your username :"+username+"Location"+"Lat"+lat+"Longt"+longt;
        return var;
    }


    @Autowired
    UpdateLocation updateLocation;

    @PostMapping("/locPost")
    public String LocationUpdateByPost(@RequestParam("userName") String usrName, @RequestParam("Lat") String lat, @RequestParam("Longt") String longt)
    {

        return updateLocation.update(usrName, lat, longt);

    }

    @Autowired
    NewUsers newUsers;

    @PostMapping("/newMaster")
    public String AddNewMaster(@RequestBody UserDTO userDTO)
    {
        newUsers.addMaster(userDTO);
        return "post success";
    }

    @PostMapping("/newSlave")
    public String AddNewSlave(@RequestBody UserDTO userDTO)
    {
        newUsers.addSlave(userDTO);
        return "post success";
    }

    @Autowired
    ConnectMaster connectMaster;
    @PostMapping("/pickMaster")
    public String pickMasterToSlave(@RequestParam("slaveUser") String slave,@RequestParam("masterUser") String master)
    {
       return connectMaster.ConnectMastertoSlave(slave, master);
    }

    @Autowired
    allSlaveLocations allslave;

    @GetMapping("/getSlaveLoc/{username}")
    public Slave[] AllSlaveLocations(@PathVariable String username){

        return allslave.getMySlaves(username);
    }

}
