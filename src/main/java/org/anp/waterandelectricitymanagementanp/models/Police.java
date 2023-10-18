package org.anp.waterandelectricitymanagementanp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Police implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private String id_P;
    private int numero_compteur;
    private String id_type_police;
    private String id_type_fourniture_eau;
    private String statut;
    @OneToOne(fetch = FetchType.LAZY)
    private Port port;
    @OneToMany(fetch = FetchType.LAZY)
    private List<TypeFournitureEau> typeFournitureEaus;
    @OneToOne(fetch = FetchType.LAZY)
    private TypePolice typepolice;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Client> client;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Releve> releve;
    @Enumerated
    private StatutReleve statutReleve;
}

