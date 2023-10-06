package com.gemetech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.gemetech.entity.Libro;
import com.gemetech.service.LibroService;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/gestionLibro")
    public String gestUsuario() {
        return "gestLibro";
    }

    @GetMapping("/libros")
    public ModelAndView getAllLibros() {
        List<Libro> list = libroService.getAllLibro();
        // ModelAndView m = new ModelAndView();
        // m.setViewName("listaLibros");
        // m.addObject("libro", list);
        return new ModelAndView("listaLibros", "libro", list);
    }

    @GetMapping("/nuevoLibro")
    public String nuevoLibro() {
        return "nuevoLibro";
    }

    @PostMapping("/guardarLibro")
    public String guardarLibro(@ModelAttribute Libro libro) {
        libroService.save(libro);
        return "redirect:/libros";
    }

    @GetMapping("/editarLibro/{id}")
    public String editarLibro(@PathVariable("id") int id, Model model) {
        Libro libro = libroService.getLibroById(id);
        model.addAttribute("libro", libro);
        return "editarLibro";
    }

    @PostMapping("/actualizarLibro/{id}")
    public String actualizarLibro(@PathVariable("id") int id, @ModelAttribute Libro libro) {
        libro.setId(id);
        libroService.save(libro);
        return "redirect:/libros";
    }

    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable("id") int id) {
        libroService.deleteById(id);
        ;
        return "redirect:/libros";
    }
}
