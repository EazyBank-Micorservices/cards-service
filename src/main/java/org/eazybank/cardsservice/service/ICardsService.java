package org.eazybank.cardsservice.service;

import org.eazybank.cardsservice.dto.CardDto;

public interface ICardsService {
    void createCard(String mobileNumber);
    CardDto fetchCard(String mobileNumber);

    boolean updateCard(CardDto cardsDto);

    boolean deleteCard(String mobileNumber);
}
