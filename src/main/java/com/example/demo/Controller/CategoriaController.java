package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    // @Autowired
    // private CategoriaService categoriaService;

    // @Autowired
    // private CategoriaRepository categoriaRepository;

    // @GetMapping
    // public String index(Model model) {
    //     List<Categoria> categorias = categoriaService.findAll();
    //     model.addAttribute("categorias", categorias);
    //     return "categoria/listar";
    // }

    // @GetMapping("/create")
    // public String showCreateForm(Model model) {
    //     model.addAttribute("categoria", new Categoria());
    //     return "categoria/create";
    // }

    // @PostMapping("/create")
    // public String create(
    //         @Valid Categoria categoria,
    //         BindingResult bindingResult,
    //         Model model,
    //         RedirectAttributes redirectAttributes) {

    //     if (bindingResult.hasErrors()) {
    //         model.addAttribute("errors", bindingResult.getAllErrors());
    //         return "categoria/create";
    //     }

    //     categoriaService.create(categoria);
    //     redirectAttributes.addFlashAttribute("successMessage", "Categoria criada com sucesso!");
    //     return "redirect:/categoria";
    // }

    // @GetMapping("/update/{id}")
    // public String showUpdateForm(@PathVariable Long id, Model model) {
    //     Optional<Categoria> categoria = categoriaService.findById(id);
    //     model.addAttribute("categoria", categoria.orElseThrow(() -> new RuntimeException("Categoria não encontrada")));
    //     return "categoria/update";
    // }

    // @PostMapping("/update/{id}")
    // public String update(
    //         @PathVariable Long id,
    //         @Valid Categoria categoria,
    //         BindingResult bindingResult,
    //         Model model,
    //         RedirectAttributes redirectAttributes) {

    //     if (bindingResult.hasErrors()) {
    //         model.addAttribute("errors", bindingResult.getAllErrors());
    //         return "categoria/update";
    //     }

    //     categoriaService.update(id, categoria);
    //     redirectAttributes.addFlashAttribute("successMessage", "Categoria atualizada com sucesso!");
    //     return "redirect:/categoria";
    // }

    // @GetMapping("/categoria/visualizar/{id}")
    // public String visualizar(@PathVariable Long id, Model model) {
    //     Optional<Categoria> categoria = categoriaService.findById(id);
    //     model.addAttribute("categoria", categoria.orElseThrow(() -> new RuntimeException("Categoria não encontrada")));
    //     return "categoria/visualizar";
    // }

    // @GetMapping("/categoria/remover/{id}")
    // public String remover(@PathVariable Long id, RedirectAttributes redirectAttributes) {
    //     Optional<Categoria> categoria = categoriaService.findById(id);
    //     Categoria categoriaModel = categoria.orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

    //     if (categoriaModel.isAtivo()) {
    //         categoriaModel.setAtivo(false);
    //         redirectAttributes.addFlashAttribute("successMessage", "Categoria excluída com sucesso!");
    //     } else {
    //         categoriaModel.setAtivo(true);
    //         redirectAttributes.addFlashAttribute("successMessage", "Categoria recuperada com sucesso!");
    //     }
    //     this.categoriaRepository.save(categoriaModel);
    //     return "redirect:/categoria";
    // }
}
