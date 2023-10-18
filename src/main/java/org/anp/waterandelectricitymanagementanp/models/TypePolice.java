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
public class TypePolice implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String IdTypePolice;
    private String Type;
    @OneToOne(fetch = FetchType.LAZY)
    private Police police;
}
