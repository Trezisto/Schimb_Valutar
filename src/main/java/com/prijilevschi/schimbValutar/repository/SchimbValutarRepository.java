package com.prijilevschi.schimbValutar.repository;

import com.prijilevschi.schimbValutar.model.SchimbValutarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchimbValutarRepository extends JpaRepository<SchimbValutarModel, Long> {
}
