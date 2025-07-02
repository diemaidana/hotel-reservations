package com.hotel.service;

import com.hotel.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientServiceImpl {
    private final ClientRepository repository;
}
