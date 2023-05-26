package com.programming.inventoryservice.controller;

import com.programming.inventoryservice.dto.InventoryResponse;
import com.programming.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // path variable: http://localhost:8082/api/inventory/aifon-13,aifon-13-red...
    // path param:  http://localhost:8082/api/inventory?sku-code=aifon-13&sku-code=aifon-13-red...
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
