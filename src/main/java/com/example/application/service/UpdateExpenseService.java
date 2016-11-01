package com.example.application.service;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    public void execute(Expense expense) {

        expenseRepository.save(expense);
    }
}
