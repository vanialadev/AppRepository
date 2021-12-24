package br.com.vaniala.apprepository.data.repositories

import br.com.vaniala.apprepository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}