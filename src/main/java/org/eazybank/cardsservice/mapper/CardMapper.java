package org.eazybank.cardsservice.mapper;

import org.eazybank.cardsservice.dto.CardDto;
import org.eazybank.cardsservice.model.Card;

public class CardMapper {
    public static CardDto mapToCardsDto(Card card, CardDto cardDto) {
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setCardType(card.getCardType());
        cardDto.setMobileNumber(card.getMobileNumber());
        cardDto.setTotalLimit(card.getTotalLimit());
        cardDto.setAvailableAmount(card.getAvailableAmount());
        cardDto.setAmountUsed(card.getAmountUsed());
        return cardDto;
    }

    public static Card mapToCards(CardDto cardsDto, Card cards) {
        cards.setCardNumber(cardsDto.getCardNumber());
        cards.setCardType(cardsDto.getCardType());
        cards.setMobileNumber(cardsDto.getMobileNumber());
        cards.setTotalLimit(cardsDto.getTotalLimit());
        cards.setAvailableAmount(cardsDto.getAvailableAmount());
        cards.setAmountUsed(cardsDto.getAmountUsed());
        return cards;
    }
}
