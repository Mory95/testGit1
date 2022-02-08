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
@Table(name = "TEMOIN_DECLARATION")
public class Temoin_declaration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

    @Column(name = "DATE")
    private Date date;
    
    @ManyToOne
	@JoinColumn(name = "TEMOIN")
	private Temoin temoin;
	@ManyToOne
	@JoinColumn(name = "DECLARATION_MARIAGE")
	private Declaration_mariage declaration_mariage;
	@ManyToOne
	@JoinColumn(name = "DECLARATION_DECES")
	private Declaration_deces declaration_deces;
	@ManyToOne
	@JoinColumn(name = "DECLARATION_NAISSANCE")
	private Declaration_naissance declaration_naissance;
}
