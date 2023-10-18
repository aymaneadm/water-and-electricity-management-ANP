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
public class Port implements Serializable {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private String  id_Port;
    private String nomPort;
    private String id_region;
    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;
    @OneToOne(fetch = FetchType.LAZY)
    private Police police;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Client> client;
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> user;
}