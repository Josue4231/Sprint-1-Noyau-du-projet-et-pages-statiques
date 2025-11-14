package org.ldv.jogame.model.entity

open class Utilisateur(
    val idUtilisateur: Int,
    var nom: String,
    var prenom: String,
    var email: String,
    var motDePasse: String,
    var role: String
) {
    fun creerCompte() {}
    fun seConnecter() {}
    fun seDeconnecter() {}
    fun modifierProfil() {}
}
