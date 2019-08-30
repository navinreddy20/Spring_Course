package com.telusko.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
