package com.example.cards.repository;

import com.example.cards.entity.Cards;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {
    Optional<Cards> findByCardId(Long cardId);

    @Transactional
    @Modifying
    void deleteByCardId(Long cardId);

}
