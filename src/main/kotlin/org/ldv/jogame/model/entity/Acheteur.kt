package org.ldv.jogame.model.entity

class Acheteur(
    idUtilisateur: Int,
    nom: String,
    prenom: String,
    email: String,
    motDePasse: String,
    role: String = "client"
) : Utilisateur(idUtilisateur, nom, prenom, email, motDePasse, role) {

    fun activerCle(cle: String, plateforme: String) {}
    fun telechargerCle() {}
}
