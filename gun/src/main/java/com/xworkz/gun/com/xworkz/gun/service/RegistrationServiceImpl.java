package com.xworkz.gun.com.xworkz.gun.service;

import com.xworkz.gun.com.xworkz.gun.dto.GunDetailsDTO;
import com.xworkz.gun.com.xworkz.gun.repository.GunDetailsRepo;
import com.xworkz.gun.entity.GunDetails;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    GunDetailsRepo repo;

    @Override
    public boolean ValidateAndSave(GunDetailsDTO detailsDTO) {
        GunDetails detaiils=new GunDetails();

        BeanUtils.copyProperties(detailsDTO,detaiils);
       GunDetails details2=repo.save(detaiils);
      if (Objects.isNull(details2)){
          System.out.println("Your data is not saved");
          return false;
      }else {
          System.out.println("Your data is saved");
          return true;
      }

    }
}
