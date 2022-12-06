package tn.example.examenboutique.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CentreCommercial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private String adresse;
    private  String login;
    private String password;
    @OneToMany(mappedBy = "centreCommercial")
    Set<Boutique> boutiques = new HashSet<>();

}
