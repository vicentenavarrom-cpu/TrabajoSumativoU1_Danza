package com.example.danzauniacc.data
import com.example.danzauniacc.data.local.*
import com.example.danzauniacc.domain.*
import kotlinx.coroutines.flow.*
import javax.inject.Inject
class EstudianteRepositoryImpl @Inject constructor(private val dao:EstudianteDao):EstudianteRepository { override fun obtenerEstudiante(id:Int):Flow<Estudiante?>=flowOf(null); override fun obtenerRetroalimentaciones(id:Int):Flow<List<Retroalimentacion>>=dao.obtenerRetroalimentaciones(id).map{it.map{r->Retroalimentacion(r.id,r.estudianteId,r.claseId,r.tipo,r.comentario,r.fecha)}}; override suspend fun guardarRetroalimentacion(r:Retroalimentacion){dao.insertarRetroalimentacion(RetroalimentacionEntity(r.id,r.estudianteId,r.claseId,r.tipo,r.comentario,r.fecha))} }
