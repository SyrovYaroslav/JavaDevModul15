package com.springsecurity.JavaDevModul15;


import com.springsecurity.JavaDevModul15.dto.NoteDTO;
import com.springsecurity.JavaDevModul15.entity.Note;

public class NoteMapper {
    public static NoteDTO fromNote(Note note) {
        NoteDTO noteDTO = new NoteDTO();

        noteDTO.setId(note.getId());
        noteDTO.setTitle(note.getTitle());
        noteDTO.setContent(note.getContent());

        return noteDTO;
    }

    public static Note fromNoteDTO(NoteDTO noteDTO) {
        Note note = new Note();

        note.setId(noteDTO.getId());
        note.setTitle(noteDTO.getTitle());
        note.setContent(noteDTO.getContent());

        return note;
    }
}

