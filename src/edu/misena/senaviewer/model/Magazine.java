package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;

public class
Magazine {

    public int id;
    public String title;
    public String editionDate;
    public String editorial;
    public List<String> authors;


    public Magazine(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void removeAuthor(String author) {
        authors.remove(author);
    }
}