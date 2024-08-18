package com.banco.clientinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.banco.clientinfo.exeption.CustomException;
import com.banco.clientinfo.model.Client;
import com.banco.clientinfo.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{type}/{document}")
    public ResponseEntity<Client> getClientInfo(@PathVariable String type, @PathVariable int document) {
        try {
            Client client = clientService.getClientByDocument(type, document);
            return new ResponseEntity<>(client, HttpStatus.OK);
        } catch (CustomException e) {
            throw e;
        } catch (Exception e) {
            throw new CustomException("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
