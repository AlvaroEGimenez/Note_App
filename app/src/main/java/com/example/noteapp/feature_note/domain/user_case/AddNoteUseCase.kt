package com.example.noteapp.feature_note.domain.user_case

import com.example.noteapp.feature_note.domain.model.InvalidNoteException
import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
    ) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isNotBlank()){
            throw InvalidNoteException("The title of the note can`t be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note can`t be empty")
        }
        repository.insertNote(note)
    }

}