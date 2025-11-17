package org.ldv.jogame.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "plateformes_externes")
class PlateformeExterne(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idPlateforme: Int? = null,  // ID auto-généré

    @Column(nullable = false, unique = true)
    var nom: String,

    @Column(nullable = false)
    var urlActivation: String
) {

    @Transient
    fun activerCle(cle: String) {
        // logique non persistée
    }
}
