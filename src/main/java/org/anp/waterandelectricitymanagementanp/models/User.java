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
public class User implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private String idUser;
    private String nom;
    private String prenom ;
    private String adresse;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    private Port port;
    @OneToMany(fetch = FetchType.LAZY)
    private List<UserProfil> userProfils;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Releve> releve;
    @Enumerated
    private RoleUser roleClient;

}
