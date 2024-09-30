package com.franquicia_api.services;

import com.franquicia_api.models.SucursalModel;
import com.franquicia_api.repositories.ISucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    @Autowired
    ISucursalRepository sucursalRepository;

    public SucursalModel saveSucursal(SucursalModel sucursal) {
        sucursalRepository.save(sucursal);
        return sucursalRepository.save(sucursal);
    }
}
