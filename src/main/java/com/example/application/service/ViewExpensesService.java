package com.example.application.service;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ViewExpensesService  {

    @Autowired
    ExpenseRepository expenseRepository;

    public List<Expense> execute() {
        List<Expense> expenses = expenseRepository.findAll();

        return expenses;
    }

}