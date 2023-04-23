package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Merchant;
import com.example.paymenttaskwithspringboot.repository.MerchantRepository;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {
    private final MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public Merchant createMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }
}
