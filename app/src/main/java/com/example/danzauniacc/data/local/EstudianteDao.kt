package com.example.danzauniacc.data.local
import androidx.room.*
import kotlinx.coroutines.flow.Flow
@Dao interface EstudianteDao { @Query("SELECT * FROM retroalimentaciones WHERE estudianteId = :estudianteId ORDER BY fecha DESC") fun obtenerRetroalimentaciones(estudianteId:Int):Flow<List<RetroalimentacionEntity>>; @Insert(onConflict=OnConflictStrategy.REPLACE) suspend fun insertarRetroalimentacion(r:RetroalimentacionEntity) }
