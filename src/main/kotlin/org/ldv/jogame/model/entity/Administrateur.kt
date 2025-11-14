package org.ldv.jogame.model.entity

class Administrateur(
    idUtilisateur: Int,
    nom: String,
    prenom: String,
    email: String,
    motDePasse: String,
    role: String = "administrateur"
) : Utilisateur(idUtilisateur, nom, prenom, email, motDePasse, role) {

    fun ajouterJeu() {}
    fun modifierJeu() {}
    fun supprimerJeu() {}
    fun gererUtilisateurs() {}
    fun consulterStatistiques() {}
}
