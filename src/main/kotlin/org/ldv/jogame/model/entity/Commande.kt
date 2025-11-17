package org.ldv.jogame.model.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "commandes")
class Commande(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idCommande: Int? = null, // doit être nullable pour JPA

    @Column(nullable = false)
    var dateCommande: LocalDate, // plus sûr que String pour manipuler les dates

    @Column(nullable = false)
    var montantTotal: Float,

    @Column(nullable = false)
    var statut: String
) {

    @Transient
    fun validerCommande() {
        // Méthode non persistée
    }
}

