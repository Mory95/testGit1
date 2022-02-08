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
@Table(name = "DECLARATION_MARIAGE")
public class Declaration_mariage {
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

    @Column(name = "DATE_MARIAGE")
    private Date date_mariage;
    @Column(name = "SITUATION_MAT")
    private String situation_mat;
    
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
	@ManyToOne
	@JoinColumn(name = "CONCERNE")
	private Concerne conserne;
	
	
	public Declaration_mariage() {
		super();
	}

	public Declaration_mariage(String type_declaration, Date date_declaration, String mension_marinale,
			Date date_mariage, String situation_mat, Pere pere, Mere mere, Declarant declarant,Centre centre) {
		super();
		this.type_declaration = type_declaration;
		this.date_declaration = date_declaration;
		this.mension_marinale = mension_marinale;
		this.date_mariage = date_mariage;
		this.situation_mat = situation_mat;
		this.pere = pere;
		this.mere = mere;
		this.declarant = declarant;
		this.centre = centre;
	}

	public String getType_declaration() {
		return type_declaration;
	}

	public void setType_declaration(String type_declaration) {
		this.type_declaration = type_declaration;
	}

	public Date getDate_declaration() {
		return date_declaration;
	}

	public void setDate_declaration(Date date_declaration) {
		this.date_declaration = date_declaration;
	}

	public String getMension_marinale() {
		return mension_marinale;
	}

	public void setMension_marinale(String mension_marinale) {
		this.mension_marinale = mension_marinale;
	}

	public Date getDate_mariage() {
		return date_mariage;
	}

	public void setDate_mariage(Date date_mariage) {
		this.date_mariage = date_mariage;
	}

	public String getSituation_mat() {
		return situation_mat;
	}

	public void setSituation_mat(String situation_mat) {
		this.situation_mat = situation_mat;
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

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	
	
	
}
