package fr.humanbooster.ideanoval.business;
// Generated 13 avr. 2016 14:47:43 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorie generated by hbm2java
 */
@Entity
@Table(name = "categorie")
public class IdeeCategorie implements Serializable {

	private static final long serialVersionUID = 3512997461978316704L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCategorie", unique = true, nullable = false)
	private int idCategorie;
	
	@Column(name = "intitule", nullable = false, length = 30)
	private String intitule;
	
	@Column(name = "metaReferencement", length = 250)
	private String metaReferencement;
	
	
	@OneToMany (mappedBy="categorie", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@org.hibernate.annotations.Cascade( {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private Set<Idee> idees = new HashSet<Idee>();


	public IdeeCategorie() {
	}


	public IdeeCategorie(String intitule, String metaReferencement, Set<Idee> idees) {
		super();
		this.intitule = intitule;
		this.metaReferencement = metaReferencement;
		this.idees = idees;
	}


	public IdeeCategorie(int idCategorie, String intitule, String metaReferencement, Set<Idee> idees) {
		super();
		this.idCategorie = idCategorie;
		this.intitule = intitule;
		this.metaReferencement = metaReferencement;
		this.idees = idees;
	}


	public int getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}


	public String getMetaReferencement() {
		return metaReferencement;
	}


	public void setMetaReferencement(String metaReferencement) {
		this.metaReferencement = metaReferencement;
	}


	public Set<Idee> getIdees() {
		return idees;
	}


	public void setIdees(Set<Idee> idees) {
		this.idees = idees;
	}

}
