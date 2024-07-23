package com.sivaTejaswi.simplebankingapp.service;

import com.sivaTejaswi.simplebankingapp.domain.entity.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> findTransactionsByCardId(long id);
}
