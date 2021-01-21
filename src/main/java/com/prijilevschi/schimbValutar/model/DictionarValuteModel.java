package com.prijilevschi.schimbValutar.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dictionar_valute")
public class DictionarValuteModel {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @OneToMany(mappedBy = "dictionarValuteModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<CursValutarModel> cursValutar;
}
