package org.anp.waterandelectricitymanagementanp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfil implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private String libelle;
}
