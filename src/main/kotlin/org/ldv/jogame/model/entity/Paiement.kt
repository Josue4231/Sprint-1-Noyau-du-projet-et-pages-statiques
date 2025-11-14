package org.ldv.jogame.model.entity

class Paiement(
    val idPaiement: Int,
    var methode: String,
    var montant: Float,
    val datePaiement: String,
    var statut: String
) {
    fun effectuerPaiement() {}
    fun verifierPaiement() {}
}
