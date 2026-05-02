package com.example.intermediate_kotlinapp.ui.about

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.intermediate_kotlinapp.data.about.AboutRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Stable
internal class AboutViewModel constructor(
    private val aboutRepository: AboutRepository
) : ViewModel() {

    private val _state = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val state = _state.asStateFlow()

    init {
        fetchData()
    }

    fun fetchData() {
        viewModelScope.launch {
            _state.value = aboutRepository.getAbout()
        }
    }
}

val aboutViewModelFactory = viewModelFactory {
    initializer {
        AboutViewModel(getAboutRepository())
    }
}

private fun getAboutRepository(): AboutRepository = AboutRepository()