package kr.ac.kumoh.s20220633.s26w06navigation.repository

import kr.ac.kumoh.s20220633.s26w06navigation.model.Pokemon

interface PokemonRepository {
    suspend fun getAllPokemon(): List<Pokemon>
    suspend fun getPokemonById(id: Int): Pokemon?
}