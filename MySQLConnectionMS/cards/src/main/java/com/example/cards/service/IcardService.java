package com.example.cards.service;

import com.example.cards.dto.CardsDto;

public interface IcardService {
    void createCard(String mobileNumber);
    CardsDto fetchCardDetails(String mobileNumber);
    boolean updateCardDetails(CardsDto cardsDto);
    boolean deleteCard(String mobileNumber);

}
