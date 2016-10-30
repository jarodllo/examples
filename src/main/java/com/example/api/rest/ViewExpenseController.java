package com.example.api.rest;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewExpenseController {

    @Autowired
    ExpenseRepository expenseRepository;

    @GetMapping("/expenses/{id}")
    public Expense viewExpenseAction(Model model, @PathVariable Long id) {

        Expense expense = expenseRepository.findOne(id);

        model.addAttribute("expense", expense);

        return expense;
    }

}
