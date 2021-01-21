package com.prijilevschi.schimbValutar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curs_valutar")
public class CursValutarModel {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_currency", nullable = false)
    private DictionarValuteModel dictionarValuteModel;
    private Integer ordinal;
    private BigDecimal exchangeRate;
    private LocalDate exchangeDate;
}
