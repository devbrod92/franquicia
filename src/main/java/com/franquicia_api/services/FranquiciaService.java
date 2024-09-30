package com.franquicia_api.services;

import com.franquicia_api.models.FranquiciaModel;
import com.franquicia_api.repositories.IFranquiciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FranquiciaService {

    @Autowired
    IFranquiciaRepository franquiciaRepository;

    public ArrayList<FranquiciaModel> getAllFranquicias() {
        return (ArrayList<FranquiciaModel>) franquiciaRepository.findAll();
    }

    public FranquiciaModel saveFranquicia(FranquiciaModel franquicia) {
        franquiciaRepository.save(franquicia);
        return franquicia;
    }
}
