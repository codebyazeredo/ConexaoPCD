package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Form.Deficiencia.DeficienciaForm;
import com.example.demo.Model.Categoria;
import com.example.demo.Model.Deficiencia;
import com.example.demo.Repository.CategoriaRepository;
import com.example.demo.Repository.DeficienciaRepository;
import com.example.demo.Service.DeficienciaService;

import jakarta.validation.Valid;

@Controller
public class DeficienciaController {

    @Autowired
    private DeficienciaRepository dR;

    @Autowired
    private CategoriaRepository cR;

    @Autowired
    private DeficienciaService dS;

    @GetMapping("/deficiencia")
    public String index(Model model, @RequestParam("display") Optional<String> display) {
        String finalDisplay = display.orElse("true");
        List<Deficiencia> deficiencias = dR.findByAtivo(Boolean.valueOf(finalDisplay));
        model.addAttribute("deficiencias", deficiencias);
        return "deficiencia/listar";
    }

    @GetMapping("deficiencia/create")
    public String create(Model model){
        DeficienciaForm deficienciaForm = new DeficienciaForm();

        List<Categoria> listCategorias = cR.findAll();
        deficienciaForm.setListCategorias(listCategorias);

        model.addAttribute("deficienciaForm", deficienciaForm);

        return "deficiencia/create";
    }

    @PostMapping("/deficiencia/create")
    public String create(@Valid DeficienciaForm df, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        List<Categoria> listCategorias = cR.findAll();
        model.addAttribute("DeficienciaForm", df);

        if (bindingResult.hasErrors()) {
            model.addAttribute("erros", bindingResult.getAllErrors());
            return "/deficiencia/create";
        }

        redirectAttributes.addFlashAttribute("successMessage", "Salvo com sucesso!");
        dS.create(df);
        return "redirect:/deficiencia";
    }

    @GetMapping("/deficiencia/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Optional<Deficiencia> deficiencia = dR.findById(id);
        DeficienciaForm df = new DeficienciaForm(deficiencia.orElseThrow());
        List<Categoria> listCategorias = cR.findAll();
        df.setListCategorias(listCategorias);
        model.addAttribute("deficienciaForm", df);
        model.addAttribute("id", deficiencia.orElseThrow().getId());
        return "/deficiencia/update";
    }

    @GetMapping("/deficiencia/visualizar/{id}")
    public String visualizar(@PathVariable Long id, Model model) {
        
        Optional<Deficiencia> deficiencia = dR.findById(id);
        DeficienciaForm df = new DeficienciaForm(deficiencia.orElseThrow());
        
        List<Categoria> listCategorias = cR.findAll();
        
        df.setListCategorias(listCategorias);
        
        model.addAttribute("deficienciaForm", df);
        model.addAttribute("id", deficiencia.orElseThrow().getId());
        
        return "/deficiencia/visualizar";
    }

    @PostMapping("/deficiencia/update/{id}")
    public String update(@PathVariable Long id, @Valid DeficienciaForm deficienciaForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        List<Categoria> listCategorias = cR.findAll();
        deficienciaForm.setListCategorias(listCategorias);
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/deficiencia/update";
        }
        dS.update(deficienciaForm, id);
        redirectAttributes.addFlashAttribute("successMessage", "Alterado com sucesso!");
        return "redirect:/deficiencia";
    }

    @GetMapping("/deficiencia/remover/{id}")
    public String remover(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        Optional<Deficiencia> deficiencia = this.dR.findById(id);
        Deficiencia deficienciaModel = deficiencia.orElseThrow(() -> new RuntimeException("Deficiência não encontrada"));
        if (deficienciaModel.isAtivo()) {
            deficienciaModel.setAtivo(false);
            redirectAttributes.addFlashAttribute("successMessage", "Excluído com sucesso!");
        } else {
            deficienciaModel.setAtivo(true);
            redirectAttributes.addFlashAttribute("successMessage", "Recuperado com sucesso!");
        }
        this.dR.save(deficienciaModel);
        return "redirect:/deficiencia";
    }
}
