package org.anp.waterandelectricitymanagementanp.models;

import ch.qos.logback.core.model.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sound.midi.Sequence;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy=GenerationType.SEQUENCE) //
    private String id_Region;
    private String nom;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Port> ports;

}
