package org.ldv.jogame.model.entity

class Commande(
    val idCommande: Int,
    val dateCommande: String, // ou LocalDate
    var montantTotal: Float,
    var statut: String
) {
    fun validerCommande() {}
}
