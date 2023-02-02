package com.centrosconsumo.service;

import com.centrosconsumo.model.CentrosConsumo;
import com.centrosconsumo.repository.CentrosConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CentrosConsumoServiceImpl implements CentrosConsumoService{

    @Autowired
    private CentrosConsumoRepository centrosConsumoRepository;
    @Override
    public CentrosConsumo saveCentrosConsumo(CentrosConsumo centrosConsumo) {
        return centrosConsumoRepository.save(centrosConsumo);
    }
    @Override
    public List<CentrosConsumo> getAllCentrosConsumo() {
        return centrosConsumoRepository.findAll();
    }
}
