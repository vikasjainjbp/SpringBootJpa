package com.my.vikas.controller;

import com.my.vikas.exception.ResourceNotFoundException;
import com.my.vikas.model.Note;
import com.my.vikas.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note){
       return noteRepository.save(note);
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable(value = "id") long id){
        return noteRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Note","Id",id));
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") long id, @Valid @RequestBody Note noteToUpdate ){
        Note note = noteRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Note","Id",id));

        note.setTitle(noteToUpdate.getTitle());
        note.setContent(noteToUpdate.getContent());

        return noteRepository.save(note);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable long id){
        Note note = noteRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Note","Id",id));
        noteRepository.delete(note);
        return ResponseEntity.ok().build();
    }


}
