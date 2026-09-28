package com.example.danzauniacc
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.danzauniacc.presentation.EstudianteViewModel
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint class MainActivity : ComponentActivity() { override fun onCreate(b: Bundle?) { super.onCreate(b); setContent { val vm: EstudianteViewModel = hiltViewModel(); val f by vm.retroalimentaciones.collectAsState(); MaterialTheme { Column(Modifier.fillMaxSize().padding(24.dp)) { Text("Historial de Danza", style=MaterialTheme.typography.headlineMedium); Spacer(Modifier.height(16.dp)); if(f.isEmpty()) Text("No existen retroalimentaciones registradas.") else f.forEach { Text("• ${it.tipo}: ${it.comentario}") } } } } } }
