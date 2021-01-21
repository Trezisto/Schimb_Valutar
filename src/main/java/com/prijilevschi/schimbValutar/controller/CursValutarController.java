package com.prijilevschi.schimbValutar.controller;

import com.prijilevschi.schimbValutar.model.CursValutarModel;
import com.prijilevschi.schimbValutar.repository.CursValutarRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/curs")
public class CursValutarController {

    private CursValutarRepository cursValutarRepository;

    public CursValutarController(CursValutarRepository cursValutarRepository) {
        this.cursValutarRepository = cursValutarRepository;
    }

    @RequestMapping(method = RequestMethod.GET, params = "currency")
    public Set<CursValutarModel> getCursValutar(String currency) {
        Set<CursValutarModel> cursValutarModelSet = cursValutarRepository.findTodayCursValutarByValuta(currency);
        return cursValutarModelSet;
    }

    @RequestMapping(method = RequestMethod.POST)
    public CursValutarModel addExchangeRate(@RequestBody CursValutarModel cursValutar) {
        CursValutarModel savedEntity = cursValutarRepository.save(cursValutar);
        return savedEntity;
    }
}
