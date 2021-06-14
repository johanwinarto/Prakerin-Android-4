package com.ahmadfariz.portalwisata.dao

import androidx.room.*
import com.ahmadfariz.portalwisata.model.ModelNote

@Dao
interface NoteDao {
    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNote: List<ModelNote?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(modelNote: ModelNote?)

    @Delete
    fun delete(modelNote: ModelNote?)
}