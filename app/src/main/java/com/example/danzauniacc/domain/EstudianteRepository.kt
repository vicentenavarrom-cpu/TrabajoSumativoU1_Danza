package com.example.danzauniacc.domain
import kotlinx.coroutines.flow.Flow
interface EstudianteRepository { fun obtenerEstudiante(id:Int):Flow<Estudiante?>; fun obtenerRetroalimentaciones(estudianteId:Int):Flow<List<Retroalimentacion>>; suspend fun guardarRetroalimentacion(retroalimentacion:Retroalimentacion) }
