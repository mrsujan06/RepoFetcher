package com.tdd.uchit.repofetcher.data.repository

import com.tdd.uchit.repofetcher.data.model.Repo
import com.tdd.uchit.repofetcher.data.remote.RepoService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RepoRepositoryImpl(
    private val repoService: RepoService,
) : RepoRepository {

    override fun fetchRepos(): Flow<List<Repo>> = flow {
        val repo = repoService.fetchRepos()
        emit(repo)
    }.flowOn(Dispatchers.IO)
}