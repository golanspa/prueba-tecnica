package com.testGolan.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.testGolan.api.data.models.Cliente;

@Component
public interface ClientService {

	 Cliente getOneClient(Integer clientId);
	 List<Cliente> getAllClient();
}
