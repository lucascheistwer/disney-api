package com.disney.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.disney.challenge.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
} 