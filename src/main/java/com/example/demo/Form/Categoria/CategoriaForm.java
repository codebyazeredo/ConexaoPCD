package com.example.demo.Form.Categoria;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CategoriaForm {

    @NotBlank(message = "O tipo da categoria é obrigatório.")
    private String tipo;
}