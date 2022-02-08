package sn.gestionEtatCivil.gestionEtatCivilAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CENTRE")
public class Centre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

    @Column(name = "NOM")
    private String nom;
    @Column(name = "CODE_CENTRE")
    private String code_centre;
    @Column(name = "LOCALITE")
    private String localite;
    
	public Centre() {
		super();
	}

	public Centre(String nom, String code_centre, String localite) {
		super();
		this.nom = nom;
		this.code_centre = code_centre;
		this.localite = localite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode_centre() {
		return code_centre;
	}

	public void setCode_centre(String code_centre) {
		this.code_centre = code_centre;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}
    
    
	
}
