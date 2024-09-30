package com.franquicia_api.controllers;

import com.franquicia_api.models.FranquiciaModel;
import com.franquicia_api.services.FranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/franquicia")
public class FranquiciaController {

    @Autowired
    private FranquiciaService franquiciaService;

    @GetMapping
    public ArrayList<FranquiciaModel> getAllFranquicias() {
        return this.franquiciaService.getAllFranquicias();
    }

    @PostMapping
    public FranquiciaModel saveFranquicia(@RequestBody FranquiciaModel franquicia) {
        return this.franquiciaService.saveFranquicia(franquicia);
    }
}
