package com.zeynepduyenli.noteappkmm.android.note_list

import com.zeynepduyenli.noteappkmm.domain.note.Note

data class NoteListState(
    val notes : List<Note> = emptyList(),
    val searchText : String = "",
    val isSearchActive: Boolean = false
)