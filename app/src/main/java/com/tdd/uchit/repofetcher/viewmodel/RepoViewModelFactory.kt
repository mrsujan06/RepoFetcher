package com.tdd.uchit.repofetcher.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tdd.uchit.repofetcher.data.repository.RepoRepository

@Suppress("UNCHECKED_CAST")
class RepoViewModelFactory(var repository: RepoRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RepoViewModel(repository) as T
    }
}