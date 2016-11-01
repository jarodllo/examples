package com.example.api.rest;

import com.example.application.service.ViewExpensesService;
import com.example.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ViewExpensesController {

    @Autowired
    ViewExpensesService viewExpensesService;

    @GetMapping("/expenses/")
    public List<Expense> viewAllExpenseAction() {

        List<Expense> expenses = viewExpensesService.execute();

        return expenses;
    }
}
