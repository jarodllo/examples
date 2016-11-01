package com.example.api.rest;

import com.example.application.service.UpdateExpenseService;
import com.example.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateExpenseController {

    @Autowired
    UpdateExpenseService updateExpenseService;

    @PutMapping("/expenses/")
    public Expense updateExpenseAction(@RequestBody Expense expense) {

        //I use Expense entity like a list model
        updateExpenseService.execute(expense);

        return expense;
    }
}
