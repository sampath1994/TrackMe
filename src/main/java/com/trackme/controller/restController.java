package com.trackme.controller;

import com.trackme.dto.GPStrack;
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



    @PostMapping("/locPost")
    public GPStrack handleFileUpload(@RequestParam("userName") String usrName, @RequestParam("Lat") String lat, @RequestParam("Longt") String longt)
    {

        GPStrack gpStrack = new GPStrack(usrName,lat,longt);


        return gpStrack;
    }

}
