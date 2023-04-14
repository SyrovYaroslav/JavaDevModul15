package com.springsecurity.JavaDevModul15;


import com.springsecurity.JavaDevModul15.entity.Note;
import com.springsecurity.JavaDevModul15.repo.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;
    private final Random random = new Random();

    public List<Note> listAll(){
        return noteRepository.findAll();
    }

    public Note add(Note note){
        note.setId(random.nextLong());
        return noteRepository.save(note);
    }

    public void deleteById(long id){
        try {
            noteRepository.deleteById(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void update(Note note){
        try {
            noteRepository.save(note);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public Note getById(long id){
        try {
            return noteRepository.getReferenceById(id);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
