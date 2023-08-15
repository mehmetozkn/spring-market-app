package com.marketapp.MarketApp.controller;
import com.marketapp.MarketApp.dto.AddProductRequest;
import com.marketapp.MarketApp.dto.BasketProductDto;
import com.marketapp.MarketApp.service.BasketProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/operation")
public class BasketProductController {

    private final BasketProductService basketProductService;

    public BasketProductController(BasketProductService basketProductService) {
        this.basketProductService = basketProductService;
    }

    @PostMapping("/addProductToBasket")
    public ResponseEntity<BasketProductDto>
    addProductToBasket(@Validated @RequestBody AddProductRequest addProductRequest){
        return ResponseEntity.ok(basketProductService.addProductToBasket(addProductRequest));
    }





}