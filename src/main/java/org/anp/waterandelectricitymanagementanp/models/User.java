package org.anp.waterandelectricitymanagementanp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    @Id // definir cle primaire
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private String idUser;

    private String nom;

    private String prenom ;

    private String adresse;

    private String email;

    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    private Port port;

    @OneToMany(fetch = FetchType.LAZY)
    private List<UserProfil> userProfils;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Releve> releve;

    @Enumerated(EnumType.STRING)
    private RoleUser roleClient;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(roleClient.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
