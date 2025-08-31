package com.example.inventoryservice.controller;

import com.example.inventoryservice.entity.Stock;
import com.example.inventoryservice.repository.StockRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    private final StockRepository repository;

    public StockController(StockRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Stock> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Stock create(@RequestBody Stock stock) {
        return repository.save(stock);
    }
}
