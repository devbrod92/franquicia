package com.franquicia_api.controllers;

import com.franquicia_api.models.SucursalModel;
import com.franquicia_api.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
    @Autowired
    private SucursalService sucursalService;

    @PostMapping
    public SucursalModel saveSucursal(@RequestBody SucursalModel sucursal) {
        return this.sucursalService.saveSucursal(sucursal);
    }
}
