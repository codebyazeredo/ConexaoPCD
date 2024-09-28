package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Categoria;
import com.example.demo.Repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // public Categoria update(Long id, Categoria categoriaAtualizada) {
    //     Categoria categoria = categoriaRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    //     categoria.setTipo(categoriaAtualizada.getTipo());
    //     return categoriaRepository.save(categoria);
    // }
}
