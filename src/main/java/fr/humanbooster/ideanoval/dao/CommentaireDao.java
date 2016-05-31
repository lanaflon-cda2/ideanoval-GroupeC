package fr.humanbooster.ideanoval.dao;

import java.util.List;

import fr.humanbooster.ideanoval.business.Commentaire;
import fr.humanbooster.ideanoval.business.Idee;

public interface CommentaireDao {
	
	public boolean addCommentaire(Commentaire commentaire);
	public boolean updateCommentaire(Commentaire commentaire);
	public boolean deleteCommentaire(Commentaire commentaire);
	public boolean deleteCommentaire(int idCommentaire);
	public Commentaire findCommentaireById(int idCommentaire);
	public List<Commentaire> findCommentairesIdee(Idee idee);

}
