package org.ldv.jogame.model.dao

import org.ldv.jogame.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

interface UtilisateurDAO : JpaRepository<Utilisateur, Long> {
}