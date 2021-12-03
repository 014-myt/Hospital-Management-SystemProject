package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
   Admin findByNameAndEmail(String name, String email);
}
