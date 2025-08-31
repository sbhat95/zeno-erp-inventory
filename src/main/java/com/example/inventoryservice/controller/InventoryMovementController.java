package com.example.inventoryservice.controller;

import com.example.inventoryservice.entity.InventoryMovement;
import com.example.inventoryservice.repository.InventoryMovementRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movements")
public class InventoryMovementController {
    private final InventoryMovementRepository repository;

    public InventoryMovementController(InventoryMovementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<InventoryMovement> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public InventoryMovement create(@RequestBody InventoryMovement movement) {
        return repository.save(movement);
    }
}
