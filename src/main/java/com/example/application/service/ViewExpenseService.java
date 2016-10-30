package com.example.application.service;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewExpenseService  {

    @Autowired
    ExpenseRepository expenseRepository;

    public Expense execute() {
        Expense expense = expenseRepository.findOne(new Long(1));

        return expense;
    }




}
