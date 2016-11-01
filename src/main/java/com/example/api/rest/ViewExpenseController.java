package com.example.api.rest;

import com.example.application.service.ViewExpenseService;
import com.example.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewExpenseController {

    @Autowired
    ViewExpenseService viewExpenseService;

    @GetMapping("/expenses/{id}")
    public Expense viewExpenseAction(@PathVariable Long id) {

        Expense expense = viewExpenseService.execute(id);

        return expense;
    }

}
