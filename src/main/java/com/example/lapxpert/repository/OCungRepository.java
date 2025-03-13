package com.example.lapxpert.repository;

import com.example.lapxpert.entity.OCung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OCungRepository extends JpaRepository<OCung, Integer> {
}
