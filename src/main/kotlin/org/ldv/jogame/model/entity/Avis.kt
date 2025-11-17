package org.ldv.jogame.model.entity
import jakarta.persistence.*

@Entity
@Table(name = "Avis")
class Avis(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var idAvis: Int? = null,

    @Column(nullable = false)
    var note: Int,

    @Column(nullable = false, length = 1000)
    var commentaire: String,

    @Column(nullable = false)
    var dateAvis: String
) {
    @Transient
    fun ajouterAvis() {
        // Méthode non persistée
    }

    @Transient
    fun supprimerAvis() {
        // Méthode non persistée
    }
}
