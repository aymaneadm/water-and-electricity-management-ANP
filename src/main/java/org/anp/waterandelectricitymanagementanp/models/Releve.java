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
public class Releve implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private String idR;
    private String moisConsommation;
    private Date dateDeReleve;
    private String lecture;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private int numeroFacture;
    @ManyToOne(fetch = FetchType.LAZY)
    private Police police;
    private String idClient;
    @OneToOne(fetch = FetchType.LAZY)
    private Facture facture;
    private Date dateInitiale;
    private String idPort;
    @Enumerated
    private StatutReleve statut;
}
