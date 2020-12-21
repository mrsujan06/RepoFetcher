package com.tdd.uchit.repofetcher.data.repository

import com.tdd.uchit.repofetcher.data.model.Repo
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
  fun fetchRepos(): Flow<List<Repo>>
}