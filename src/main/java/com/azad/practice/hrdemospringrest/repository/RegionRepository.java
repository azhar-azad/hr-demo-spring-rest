package com.azad.practice.hrdemospringrest.repository;

import com.azad.practice.hrdemospringrest.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
