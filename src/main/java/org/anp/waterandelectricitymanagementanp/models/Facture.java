package org.anp.waterandelectricitymanagementanp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private String idFacture;
    @OneToOne(fetch = FetchType.LAZY)
    private Releve releve;
    private String numFacture;
    private String Statut;
    private Date dateEmissionFacture ;
    private String montantHt;
    private String montantTtc;
    private String editeur;

}
