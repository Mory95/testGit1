package sn.gestionEtatCivil.gestionEtatCivilAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "HOPITAL")
public class Hopital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

    @Column(name = "NOM")
    private String nom;
    @Column(name = "CODE_FORMATION")
    private String code_formation;
    @Column(name = "LOCALITE")
    private String localite;
    
	public Hopital() {
		super();
	}

	public Hopital(String nom, String code_formation, String localite) {
		super();
		this.nom = nom;
		this.code_formation = code_formation;
		this.localite = localite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode_formation() {
		return code_formation;
	}

	public void setCode_formation(String code_formation) {
		this.code_formation = code_formation;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}
    
    
}
