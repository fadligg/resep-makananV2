package com.group3.resep.resep_makanan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.group3.resep.resep_makanan.model.Resep;
import com.group3.resep.resep_makanan.repository.ResepRepository;

@Controller
public class ResepController {

    @Autowired
    private ResepRepository resepRepo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("daftarResep", resepRepo.findAll());
        return "index";
    }

    @GetMapping("/tambah")
    public String formTambah(Model model) {
        model.addAttribute("resep", new Resep());
        return "form";
    }

    @PostMapping("/simpan")
    public String simpan(@ModelAttribute Resep resep) {
        resepRepo.save(resep);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String formEdit(@PathVariable Long id, Model model) {
        model.addAttribute("resep", resepRepo.findById(id).orElse(null));
        return "form";
    }

    @GetMapping("/hapus/{id}")
    public String hapus(@PathVariable Long id) {
        resepRepo.deleteById(id);
        return "redirect:/";
    }
    
    
    @GetMapping("/detail/{id}")
    public String detailResep(@PathVariable Long id, Model model) {
    Resep resep = resepRepo.findById(id).orElse(null);
    if (resep == null) {
        return "redirect:/";
    }
    model.addAttribute("resep", resep);
    return "detail";
}

}
