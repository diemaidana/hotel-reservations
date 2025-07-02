package com.hotel.service;

import com.hotel.repository.ReceptionistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReceptionistServiceImpl {
    private final ReceptionistRepository repository;
}
