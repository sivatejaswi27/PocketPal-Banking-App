package com.sivaTejaswi.simplebankingapp.service;

import com.sivaTejaswi.simplebankingapp.domain.entity.Card;

import java.util.List;

public interface CardService {

    List<Card> findCardsByUserId(long id);
    Card findCardById(long id);
}
