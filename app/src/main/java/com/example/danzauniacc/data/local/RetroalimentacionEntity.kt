package com.example.danzauniacc.data.local
import androidx.room.Entity
@Entity(tableName="retroalimentaciones") data class RetroalimentacionEntity(val id:Int,@androidx.room.ColumnInfo(name="estudianteId") val estudianteId:Int,val claseId:Int,val tipo:String,val comentario:String,val fecha:String) { @androidx.room.PrimaryKey var pk:Int=id }
