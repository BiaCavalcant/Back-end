package school.sptech.projetotfg.repository

import org.springframework.data.jpa.repository.JpaRepository
import school.sptech.projetotfg.domain.views.RequisicoesGrafico

interface RequisicoesGraficoRepository : JpaRepository<RequisicoesGrafico, Long> {
}