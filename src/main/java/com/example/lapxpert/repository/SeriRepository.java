package com.example.lapxpert.repository;

import com.example.lapxpert.entity.Seri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriRepository extends JpaRepository<Seri, Integer> {
}
