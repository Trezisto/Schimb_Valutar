package com.prijilevschi.schimbValutar.controller;

import com.prijilevschi.schimbValutar.model.NumerarModel;
import com.prijilevschi.schimbValutar.repository.NumerarRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numerar")
public class NumerarController {
    private NumerarRepository numerarRepository;

    public NumerarController(NumerarRepository numerarRepository) {
        this.numerarRepository = numerarRepository;
    }

    @RequestMapping(method = RequestMethod.PUT)
    NumerarModel correctNumerarTotal(@RequestBody NumerarModel editedNumerar) {
        return numerarRepository.save(editedNumerar);
    }
}
