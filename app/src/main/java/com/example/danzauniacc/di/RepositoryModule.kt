package com.example.danzauniacc.di
import android.content.Context
import androidx.room.Room
import com.example.danzauniacc.data.EstudianteRepositoryImpl
import com.example.danzauniacc.data.local.*
import com.example.danzauniacc.domain.EstudianteRepository
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module @InstallIn(SingletonComponent::class) object DatabaseModule { @Provides @Singleton fun db(@ApplicationContext c:Context):DanceDatabase=Room.databaseBuilder(c,DanceDatabase::class.java,"danza_database").build(); @Provides fun dao(db:DanceDatabase):EstudianteDao=db.estudianteDao() }
@Module @InstallIn(SingletonComponent::class) abstract class RepositoryModule { @Binds abstract fun bind(repo:EstudianteRepositoryImpl):EstudianteRepository }
