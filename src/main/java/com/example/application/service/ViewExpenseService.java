package com.example.application.service;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ViewExpenseService  {

    @Autowired
    ExpenseRepository expenseRepository;

    public Expense execute(Long id) {
        Expense expense = expenseRepository.findOne(id);

        return expense;
    }




}
