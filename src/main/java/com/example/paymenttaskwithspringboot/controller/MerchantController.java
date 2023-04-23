package com.example.paymenttaskwithspringboot.controller;

import com.example.paymenttaskwithspringboot.entity.Merchant;
import com.example.paymenttaskwithspringboot.service.MerchantService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    public final MerchantService merchantService;

    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    public Merchant createMerchant(@RequestBody Merchant merchant){
       return merchantService.createMerchant(merchant);
    }
}
