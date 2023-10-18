package org.anp.waterandelectricitymanagementanp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static org.yaml.snakeyaml.nodes.Tag.NULL;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE) //
    private Long idClient ;
    private String ice;
    private String secteurActivite;
    private String DentifiantFiscal;
    private int fax;
    private String email;
    private String adress;
    private String cin;
    @ManyToOne(fetch = FetchType.LAZY)
    private Port port;
    @ManyToOne(fetch = FetchType.LAZY)
    private Police police;
    @OneToOne(fetch = FetchType.LAZY)
    private TypeClient typeClient;

    public void ajouterPolice(Police police){
        this.police = police;
    }
    public void annulerPolice(){
        this.police = new Police();
    }
    public void consulterReleve(){

    }
}
