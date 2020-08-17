package br.com.fiap.aula01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//teremos metodos que serão acinados pela URL

@Controller
public class HomeController {

    //metodo inicial acionado com a URL http://localhost:8080/home
    @GetMapping("home")
    public String index(){

        //O retorno do método
        return "pagina-inicial";



    }

}
