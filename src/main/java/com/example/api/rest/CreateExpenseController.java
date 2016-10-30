package com.example.api.rest;

import com.example.domain.Expense;
import com.example.application.service.CreateExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateExpenseController {

    @Autowired
    CreateExpenseService createExpenseService;

    @PostMapping("/expenses/")
    public Expense createExpenseAction(@RequestBody Expense expense) {

        //I use Expense entity like a view model
        createExpenseService.execute(expense);

        return expense;
    }
}
