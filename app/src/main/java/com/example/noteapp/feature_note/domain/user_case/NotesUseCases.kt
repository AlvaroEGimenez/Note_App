package com.example.noteapp.feature_note.domain.user_case

data class NotesUseCases(
    val getNotes: GetNotesUseCase,
    val deteleNotes: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNote: GetNoteUseCase
)