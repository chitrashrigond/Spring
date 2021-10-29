package com.xworkz.gun.com.xworkz.gun.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.gun.entity.GunDetails;

public interface GunDetailsRepo extends CrudRepository<GunDetails, Integer>{


}
