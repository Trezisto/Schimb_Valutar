package com.prijilevschi.schimbValutar.repository;

import com.prijilevschi.schimbValutar.model.NumerarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumerarRepository extends JpaRepository<NumerarModel, Long> {
}
