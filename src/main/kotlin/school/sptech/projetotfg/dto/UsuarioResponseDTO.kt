package school.sptech.projetotfg.dto

import school.sptech.projetotfg.domain.gerenciamento.NivelAcesso

data class UsuarioResponseDTO(
    val id: Long,
    val nome: String,
    val email: String
)