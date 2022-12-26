package com.testGolan.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testGolan.api.data.models.Cliente;
import com.testGolan.api.data.repository.ClientRepository;
import com.testGolan.api.exception.ResourceNotFoundException;
import com.testGolan.api.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
    ClientRepository clientRepository;
	
	@Override
	public Cliente getOneClient(Integer clientId) throws ResourceNotFoundException{
        return clientRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));
    }

	@Override
	public List<Cliente> getAllClient() {
		return clientRepository.findAll();
    }
}
