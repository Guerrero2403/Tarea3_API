package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1, "El nombre de la rosa", "Umberto Eco", "Bompiani", 1980));
        libros.add(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
        libros.add(new Libro(3, "El túnel", " Ernesto Sabato", "Sur", 1948));
        libros.add(new Libro(4, "Rayuela", "Julio Cortázar", "Sudamericana", 1963));
        libros.add(new Libro(5, "La casa de los espíritus", "sabel Allende", "Plaza & Janés", 1982));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectando a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
