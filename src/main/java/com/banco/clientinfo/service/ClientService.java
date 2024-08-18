package com.banco.clientinfo.service;

import com.banco.clientinfo.exeption.CustomException;
import com.banco.clientinfo.model.Client;
import com.banco.clientinfo.model.DocumentType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private List<Client> clients;

    @PostConstruct
    private void loadClients() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        clients = mapper.readValue(Paths.get("src/main/resources/clients.json").toFile(), new TypeReference<List<Client>>(){});
    }

    public Client getClientByDocument(String type, int document) {
        if (!isValidDocumentType(type)) {
            throw new CustomException("Invalid document type", HttpStatus.BAD_REQUEST);
        }

        Optional<Client> clientOpt = clients.stream()
                .filter(client -> client.getDocumentType().equalsIgnoreCase(type) && client.getDocument() == document)
                .findFirst();

        if (clientOpt.isPresent()) {
            return clientOpt.get();
        } else {
            throw new CustomException("Client not found", HttpStatus.NOT_FOUND);
        }
    }

    private boolean isValidDocumentType(String type) {
        type = type.toUpperCase();

        for (DocumentType dt : DocumentType.values()) {
            if (dt.getType().equals(type)) {
                return true;
            }
        }

        return false;
    }
}
