package com.prijilevschi.schimbValutar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "schimb_valutar")
public class SchimbValutarModel {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_currency", nullable = false)
    private DictionarValuteModel currency;
    private BigDecimal exchangeRate;
    private BigDecimal received;
    private BigDecimal withdrawn;
}
