package com.prijilevschi.schimbValutar.repository;

import com.prijilevschi.schimbValutar.model.CursValutarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CursValutarRepository extends JpaRepository<CursValutarModel, Long> {
    @Query("SELECT cv FROM CursValutarModel cv JOIN cv.dictionarValuteModel dv WHERE dv.code = :dvCode")
    Set<CursValutarModel> findTodayCursValutarByValuta(String dvCode);
}
