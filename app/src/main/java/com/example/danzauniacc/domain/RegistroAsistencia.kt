package com.example.danzauniacc.domain
data class RegistroAsistencia(val id:String,val estudianteId:Int,val claseId:Int,val fecha:String,val estado:String,val sincronizado:Boolean=false)
