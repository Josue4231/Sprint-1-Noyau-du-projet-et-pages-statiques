package org.ldv.jogame.model.dao
import org.springframework.data.jpa.repository.JpaRepository

interface RoleDAO :JpaRepository<RoleDAO, Long>{
    fun findByName(nom: String): RoleDAO?
}