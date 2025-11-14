package org.ldv.jogame.model.entity

class Client(
    idUtilisateur: Int,
    nom: String,
    prenom: String,
    email: String,
    motDePasse: String,
    role: String = "client"
) : Utilisateur(idUtilisateur, nom, prenom, email, motDePasse, role) {

    fun ajouterJeuPanier() {}
    fun passerCommande() {}
    fun payerCommande() {}
    fun recevoirCle() {}
}
