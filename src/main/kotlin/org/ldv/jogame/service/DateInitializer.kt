package org.ldv.ecommerce.model.service

import org.ldv.jogame.model.dao.*
import org.ldv.jogame.model.entity.*
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer(
    private val avisDAO: AvisDAO,
    private val clientDAO: ClientDAO,
    private val commandeDAO: CommandeDAO,
    private val jeuxDAO: JeuxDAO,
    private val lignePanierDAO: LignePanierDAO,
    private val paiementDAO: PaiementDAO,
    private val panierDAO: PanierDAO,
    private val plateformeExterneDAO: PlateformeExterneDAO,
    private val utilisateurDAO: UtilisateurDAO
) : CommandLineRunner {

    override fun run(vararg args: String?) {

        // Si la base contient déjà des utilisateurs, on ne fait rien
        if (utilisateurDAO.count() > 0) {
            println("Données déjà présentes, initialisation ignorée.")
            return
        }

        println("Injection des données de test...")

        // === UTILISATEURS ===
        val client1 = Client(
            idUtilisateur = null,
            nom = "Durand",
            prenom = "Pierre",
            email = "durand@example.com",
            motDePasse = "azerty123"
        )

        val admin = Administrateur(
            idUtilisateur = null,
            nom = "Admin",
            prenom = "Jean",
            email = "admin@example.com",
            motDePasse = "admin"
        )

        utilisateurDAO.saveAll(listOf(client1, admin))

        // === JEUX ===
        val jeu1 = Jeux(
            idJeu = null,
            titre = "Super Jeu",
            description = "Jeu d'aventure épique",
            prix = 59.99f,
            categorie = "Aventure",
            plateformeCompatible = "PC",
            cleActivation = "ABC123XYZ",
            videoGameplay = "videos/super_jeu.mp4",
            imageJeu = "images/super_jeu.jpg"
        )

        jeuxDAO.save(jeu1)

        // === AVIS ===
        val avis1 = Avis(
            idAvis = null,
            note = 5,
            commentaire = "Excellent jeu !",
            dateAvis = "2025-11-17"
        )

        avisDAO.save(avis1)

        // === PANIER ===
        val panier = Panier(
            idPanier = null,
            dateCreation = "2025-11-17",
            total = 0f
        )

        panierDAO.save(panier)

        // === COMMANDE ===
        val commande = Commande(
            idCommande = null,
            dateCommande = "2025-11-17",
            montantTotal = 59.99f,
            statut = "EN_COURS"
        )

        commandeDAO.save(commande)

        println("Données initiales insérées !")
    }
}
