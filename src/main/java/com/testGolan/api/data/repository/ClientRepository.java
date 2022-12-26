package com.testGolan.api.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testGolan.api.data.models.Cliente;

@Repository
public interface  ClientRepository extends JpaRepository<Cliente, Integer> {

}
