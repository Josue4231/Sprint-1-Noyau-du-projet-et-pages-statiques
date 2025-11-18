package org.ldv.jogame.model.entity



import jakarta.persistence.*

@Entity
@DiscriminatorValue("ADMIN")
class Administrateur(
    var idutilisateur: Int? = null,
    nom: String,
    prenom: String,
    email: String,
    motDePasse: String,
    role: String = "administrateur"
) : Utilisateur(idutilisateur, nom, prenom, email, motDePasse, role) {

    @Transient
    fun ajouterJeu() {
        // logique non persistée
    }

    @Transient
    fun modifierJeu() {
        // logique non persistée
    }

    @Transient
    fun supprimerJeu() {
        // logique non persistée
    }

    @Transient
    fun gererUtilisateurs() {
        // logique non persistée
    }

    @Transient
    fun consulterStatistiques() {
        // logique non persistée
    }
}

