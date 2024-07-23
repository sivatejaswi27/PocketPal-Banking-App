package com.sivaTejaswi.simplebankingapp.service.impl;

import com.sivaTejaswi.simplebankingapp.domain.entity.Transaction;
import com.sivaTejaswi.simplebankingapp.repository.TransactionRepository;
import com.sivaTejaswi.simplebankingapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findTransactionsByCardId(long id) {
        return transactionRepository.findTransactionsByCardId(id);
    }
}
