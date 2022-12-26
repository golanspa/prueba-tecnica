package com.testGolan.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testGolan.api.data.models.Cliente;
import com.testGolan.api.service.ClientService;
import com.testGolan.api.util.ConstantsApi;

@RestController
@RequestMapping("/golan-api/v1")

public class ApiController {

	@Autowired
    ClientService clientService;
	
	@GetMapping("/prueba")
    public ResponseEntity<Cliente> getClientTest () {
		Cliente client = clientService.getOneClient(ConstantsApi.ID_CLIENTE_JUAN_TORRES);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
	
	@GetMapping("/prueba/find/{id}")
    public ResponseEntity<Cliente> getClientById (@PathVariable("id") Integer id) {
		Cliente client = clientService.getOneClient(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
	
	@GetMapping("/prueba/all")
	public ResponseEntity<List<Cliente>> getAllClients () {
	    List<Cliente> footballers = clientService.getAllClient();
	    return new ResponseEntity<>(footballers, HttpStatus.OK);
	}
}
