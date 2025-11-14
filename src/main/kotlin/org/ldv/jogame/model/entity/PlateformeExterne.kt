package org.ldv.jogame.model.entity

class PlateformeExterne(
    val idPlateforme: Int,
    var nom: String,
    var urlActivation: String
) {
    fun activerCle(cle: String) {}
}
