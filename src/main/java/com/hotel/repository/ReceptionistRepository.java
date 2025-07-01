package com.hotel.repository;

import com.hotel.model.entities.Recepcionist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionistRepository extends JpaRepository<Recepcionist, Long> {
}
