package com.tdd.uchit.repofetcher.data.remote

import com.tdd.uchit.repofetcher.data.model.Repo
import com.tdd.uchit.repofetcher.utils.Constant
import retrofit2.http.GET

interface RepoService {

    @GET(Constant.REPO_URL)
    suspend fun fetchRepos(): List<Repo>

}