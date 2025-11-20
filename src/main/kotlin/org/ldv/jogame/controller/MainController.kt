package org.ldv.jogame.controller

import org.ldv.jogame.model.dao.JeuxDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController (val jeuxDAO: JeuxDAO) {


    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template a partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/Jogame")
    fun home(): String {
        return "index"
    }

    @GetMapping("/Jogame/compte")
    fun compte(): String {
        return "compte"
    }

    @GetMapping("/Jogame/panier")
    fun panier(): String {
        return "panier"
    }

    @GetMapping("/Jogame/inscription")
    fun inscription(): String {
        return "inscription"
    }

    @GetMapping("/Jogame/index")
    fun index(): String {
        return "index"
    }

    @GetMapping("/Jogame/Support")
    fun support(): String {
        return "Support"
    }

    @GetMapping("/Jogame/tendance")
    fun tendance(): String {
        return "tendance"  // templates/tendance.html
    }

    @GetMapping("/Jogame/api/tendance")
    @ResponseBody
    fun getTrendingGames(): List<Map<String, Any?>> {
        val jeux = jeuxDAO.findAll()

        return jeux.map {
            mapOf(
                "id" to it.id,
                "title" to it.titre,
                "description" to it.description,
                "videoUrl" to it.videoGameplay,
                "price" to it.prix,
                "image" to it.imageJeu
            )
        }
    }
}