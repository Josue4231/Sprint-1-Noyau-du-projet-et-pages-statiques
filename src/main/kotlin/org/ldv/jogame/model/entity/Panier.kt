package org.ldv.jogame.model.entity

class Panier(
    val idPanier: Int,
    val dateCreation: String, // ou LocalDate
    var total: Float
) {
    fun ajouterJeu() {}
    fun supprimerJeu() {}
    fun viderPanier() {}
    fun calculerTotal() {}
}
