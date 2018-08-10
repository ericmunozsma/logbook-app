package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {

    // your tests here
    @Test
    public void cortarTexto() {

        //Arrange
        Note note = new Note();
        note.setContent("Este es un texto de prueba");

        //Act
        String result = note.getSummary();

        // Assert
        assertEquals("Este es un", result);
    }

    @Test
    public void cortarTextoVacio() {

        //Arrange
        Note note = new Note();
        note.setContent("");

        //Act
        String result = note.getSummary();

        // Assert
        assertEquals("", result);
    }

    @Test
    public void cortarTextoNull() {

        //Arrange
        Note note = new Note();
        note.setContent(null);

        //Act
        String result = note.getSummary();

        // Assert
        assertEquals("", result);
    }

    @Test
    public void cortarTextoMenor() {

        //Arrange
        Note note = new Note();
        note.setContent("Hola");

        //Act
        String result = note.getSummary();

        // Assert
        assertEquals("Hola", result);
    }
}