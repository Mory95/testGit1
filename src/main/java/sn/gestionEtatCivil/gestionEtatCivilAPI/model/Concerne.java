package sn.gestionEtatCivil.gestionEtatCivilAPI.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONERNE")
public class Concerne {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "DATE_NAISSANCE")
    private Date date_naissance;
    @Column(name = "LIEU_NAISSANCE")
    private String lieu_naissance;
    @Column(name = "DOMICILE")
    private String domicile;
    @Column(name = "STATUS")
    private String status;
    
    @ManyToOne
	@JoinColumn(name = "HOPITAL")
	private Hopital hopital;
}
