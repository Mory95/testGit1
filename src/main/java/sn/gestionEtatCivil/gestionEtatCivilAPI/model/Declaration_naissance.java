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
@Table(name = "DECLARATION_NAISSANCE")
public class Declaration_naissance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

    @Column(name = "TYPE_DECLARATION")
    private String type_declaration;
    @Column(name = "DATE_DECLARATION")
    private Date date_declaration;
    @Column(name = "MENSION_MARNINALE")
    private String mension_marinale;
    @Column(name = "DATE_NAISSANCE")
    private Date date_naissance;
    @Column(name = "SEXE")
    private String sexe;
    

	@ManyToOne
	@JoinColumn(name = "PERE")
	private Pere pere;
	@ManyToOne
	@JoinColumn(name = "MERE")
	private Mere mere;
	@ManyToOne
	@JoinColumn(name = "DECLARANT")
	private Declarant declarant;
	@ManyToOne
	@JoinColumn(name = "CENTRE")
	private Centre centre;
	
	public Declaration_naissance() {
		super();
	}

	public Declaration_naissance(String type_declaration, Date date_declaration, String mension_marinale,
			Date date_naissance, String sexe, Pere pere, Mere mere, Declarant declarant,Centre centre) {
		super();
		this.type_declaration = type_declaration;
		this.date_declaration = date_declaration;
		this.mension_marinale = mension_marinale;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
		this.pere = pere;
		this.mere = mere;
		this.declarant = declarant;
		this.centre = centre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType_declaration() {
		return type_declaration;
	}

	public void setType_declaration(String type_declaration) {
		this.type_declaration = type_declaration;
	}

	public String getMension_marinale() {
		return mension_marinale;
	}

	public void setMension_marinale(String mension_marinale) {
		this.mension_marinale = mension_marinale;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Pere getPere() {
		return pere;
	}

	public void setPere(Pere pere) {
		this.pere = pere;
	}

	public Mere getMere() {
		return mere;
	}

	public void setMere(Mere mere) {
		this.mere = mere;
	}

	public Declarant getDeclarant() {
		return declarant;
	}

	public void setDeclarant(Declarant declarant) {
		this.declarant = declarant;
	}

	public Date getDate_declaration() {
		return date_declaration;
	}

	public void setDate_declaration(Date date_declaration) {
		this.date_declaration = date_declaration;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}
    
	
	

}
