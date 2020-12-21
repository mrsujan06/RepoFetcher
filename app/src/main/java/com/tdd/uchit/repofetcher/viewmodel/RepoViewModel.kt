package com.tdd.uchit.repofetcher.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tdd.uchit.repofetcher.data.model.Repo
import com.tdd.uchit.repofetcher.data.repository.RepoRepository
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class RepoViewModel @Inject constructor(val repository: RepoRepository) : ViewModel() {

    private var _repoObservable: MutableLiveData<List<Repo>> = MutableLiveData()
    val repoObservable: LiveData<List<Repo>>
        get() = _repoObservable

    fun fetchRepos() {
        Timber.d("Fetch Repos initiated")
        viewModelScope.launch {
            repository.fetchRepos().collect {
                _repoObservable.value = it
            }
        }

    }

    override fun onCleared() {
        super.onCleared()

    }
}

