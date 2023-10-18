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
public class TypeClient  implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //

    @OneToOne(fetch = FetchType.LAZY)
    private Client client;
    private String type;
}
