package org.ldv.jogame.model.entity

class Jeux(
    val idJeu: Int,
    var titre: String,
    var description: String,
    var prix: Float,
    var categorie: String,
    var plateformeCompatible: String,
    var cleActivation: String,
    var videoGameplay: String,
    var imageJeu: String
) {
    fun afficherDetails() {}
}