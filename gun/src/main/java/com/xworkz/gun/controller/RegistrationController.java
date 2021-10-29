package com.xworkz.gun.controller;

import com.xworkz.gun.com.xworkz.gun.dto.GunDetailsDTO;
import com.xworkz.gun.com.xworkz.gun.service.RegistrationService;
import com.xworkz.gun.entity.GunDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/api")
public class RegistrationController {
Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
     @Autowired
    RegistrationService regService;
     @PatchMapping("/register")
     boolean register(@RequestBody GunDetailsDTO dto){
         logger.debug("Invoking Register");
         System.out.println(dto.toString());
        boolean isSaved= regService.ValidateAndSave(dto);
       return isSaved;
    }
   @GetMapping("/hi")
    String print(GunDetailsDTO dto){
        logger.debug("Invoking Register");
        return "Hello";
    }
}
