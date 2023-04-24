package com.example.paymenttaskwithspringboot.service;

import com.example.paymenttaskwithspringboot.entity.Merchant;
import com.example.paymenttaskwithspringboot.repository.MerchantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MerchantService {
    private final MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public Merchant createMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    public List<Merchant> selectAllMerchants() {
        return merchantRepository.findAll();
    }

    public Merchant getMerchantByName(String merchantName) {
        List<Merchant> merchantList = selectAllMerchants();
        for (Merchant merchant :merchantList) {
            if(Objects.equals(merchant.getName(),merchantName));
        }
    }
}
