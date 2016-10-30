package com.example.api.rest;

import com.example.domain.Expense;
import com.example.domain.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ViewExpensesController {

    @Autowired
    ExpenseRepository expenseRepository;

    @GetMapping("/expenses/")
    public List<Expense> viewALLExpenseAction(Model model) {

        List<Expense> expenses = expenseRepository.findAll();

        model.addAttribute("expense", expenses);

        return expenses;
    }
}
