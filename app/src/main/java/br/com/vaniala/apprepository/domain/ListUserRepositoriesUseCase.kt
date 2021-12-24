package br.com.vaniala.apprepository.domain

import br.com.vaniala.apprepository.core.UseCase
import br.com.vaniala.apprepository.data.model.Repo
import br.com.vaniala.apprepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}