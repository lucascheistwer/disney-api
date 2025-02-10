package com.disney.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.challenge.model.Character;
import com.disney.challenge.repository.CharacterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    public Character getCharacterById(Long id) {
        return characterRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Character not found with id: " + id));
    }
} 