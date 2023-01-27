package com.zeynepduyenli.noteappkmm.data.local

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import com.zeynepduyenli.noteappkmm.database.NoteDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}