package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Form.Deficiencia.DeficienciaForm;
import com.example.demo.Model.Deficiencia;
import com.example.demo.Repository.DeficienciaRepository;

@Service
public class DeficienciaService {

    @Autowired
    private DeficienciaRepository dR;

    public List<Deficiencia> findAll() {
        return dR.findAll();
    }

    public Deficiencia create(DeficienciaForm df) {
        Deficiencia deficiencia = new Deficiencia();
        deficiencia.setNome(df.getNome());
        deficiencia.setCategoria(df.getCategoria());

        dR.save(deficiencia);
        return deficiencia;
    }

    public Deficiencia update(DeficienciaForm df, Long id){
        Deficiencia deficiencia = this.dR.findById(id).orElseThrow();
        deficiencia.setNome(df.getNome());
        deficiencia.setCategoria(df.getCategoria());
        dR.save(deficiencia);
        return deficiencia;
    }
    
}

