package com.example.api.rest;

import com.example.application.service.DeleteExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteExpenseController {

    @Autowired
    DeleteExpenseService deleteExpenseService;

    @DeleteMapping("/expenses/{id}")
    public void deleteAction(@PathVariable Long id) {

        //I use Expense entity like a view model
        deleteExpenseService.execute(id);

    }
}
