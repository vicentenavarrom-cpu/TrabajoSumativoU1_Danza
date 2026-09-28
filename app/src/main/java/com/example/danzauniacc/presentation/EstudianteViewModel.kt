package com.example.danzauniacc.presentation
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.danzauniacc.domain.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.*
@HiltViewModel class EstudianteViewModel @Inject constructor(private val repository:EstudianteRepository):ViewModel(){ val retroalimentaciones:StateFlow<List<Retroalimentacion>>=repository.obtenerRetroalimentaciones(1).stateIn(viewModelScope,SharingStarted.WhileSubscribed(5000),emptyList()) }
