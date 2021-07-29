package com.stefanini.app.repository;

import com.stefanini.app.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliente extends JpaRepository<Client, Long> {
}
