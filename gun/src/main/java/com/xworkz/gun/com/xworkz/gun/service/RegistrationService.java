package com.xworkz.gun.com.xworkz.gun.service;

import com.xworkz.gun.com.xworkz.gun.dto.GunDetailsDTO;
import com.xworkz.gun.entity.GunDetails;

public interface RegistrationService {

    boolean ValidateAndSave(GunDetailsDTO detailsDTO);
}
