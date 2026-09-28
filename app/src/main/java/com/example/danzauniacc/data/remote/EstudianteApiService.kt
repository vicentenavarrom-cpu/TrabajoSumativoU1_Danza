package com.example.danzauniacc.data.remote
import retrofit2.http.GET
interface EstudianteApiService { @GET("estudiantes") suspend fun obtenerEstudiantes():List<Any> }
