package com.centrosconsumo.service;

import com.centrosconsumo.model.CentrosConsumo;

import java.util.List;

public interface CentrosConsumoService {
    public CentrosConsumo saveCentrosConsumo(CentrosConsumo centrosConsumo);

    public List<CentrosConsumo> getAllCentrosConsumo();
}
