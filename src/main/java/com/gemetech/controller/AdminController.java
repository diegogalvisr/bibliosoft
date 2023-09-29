package com.gemetech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gemetech.entity.Admin;
import com.gemetech.entity.AdminList;
import com.gemetech.service.AdminService;
import com.gemetech.service.AdminListService;

import java.util.*;

@Controller
public class AdminController {

    @Autowired
    private AdminService service;

    @Autowired
    private AdminListService myBookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/nuevoAdmin")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/gestionUsuario")
    public String gestUsuario() {
        return "gestUsuario";
    }

    @GetMapping("/activarAdmin")
    public ModelAndView getAllBook() {
        List<Admin> list = service.getAllBook();
        // ModelAndView m=new ModelAndView();
        // m.setViewName("bookList");
        // m.addObject("book",list);
        return new ModelAndView("bookList", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Admin b) {
        service.save(b);
        return "redirect:/activarAdmin";
    }

    @GetMapping("/adminActivo")
    public String getMyBooks(Model model) {
        List<AdminList> list = myBookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Admin b = service.getBookById(id);
        AdminList mb = new AdminList(b.getId(), b.getUsuario(), b.getClave(), b.getNombre(), b.getApellido(),
                b.getDireccion(), b.getCargo());
        myBookService.saveMyBooks(mb);
        return "redirect:/adminActivo";
    }

    @RequestMapping("/editarAdmin/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Admin b = service.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping("/eliminarAdmin/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/activarAdmin";
    }

}
