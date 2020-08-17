package br.com.fiap.aula01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    //Método para abrir a página com o formulário

    //http://localhost:8080/produto
    @GetMapping("produto")
    public String abrirFormulario(){

        //Página -> produto/form.html

        return "produto/form";
    }


}
