package com.prijilevschi.schimbValutar.controller;

import com.prijilevschi.schimbValutar.model.SchimbValutarModel;
import com.prijilevschi.schimbValutar.repository.SchimbValutarRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schimb")
public class SchimbValutarController {
    private SchimbValutarRepository schimbValutarRepository;

    public SchimbValutarController(SchimbValutarRepository schimbValutarRepository) {
        this.schimbValutarRepository = schimbValutarRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    SchimbValutarModel buyCurrency(@RequestBody SchimbValutarModel schimbValutarModel) {
        return schimbValutarRepository.save(schimbValutarModel);
    }
}
