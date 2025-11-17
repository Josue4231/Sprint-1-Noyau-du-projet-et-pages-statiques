package org.ldv.jogame.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController () {


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
}

