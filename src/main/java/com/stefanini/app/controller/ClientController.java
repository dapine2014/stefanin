package com.stefanini.app.controller;

import com.stefanini.app.model.entity.Client;
import com.stefanini.app.repository.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ClientController {
    @Autowired
    private ICliente iClientService;
    @GetMapping({"/","/index"})
    public String showClients(Model model){
        List<Client> listClients = iClientService.findAll();
        model.addAttribute("clients",listClients);

        return "index";
    }
    @GetMapping("/new")
    public String addClient(Model model){
      model.addAttribute("client", new Client());
     
      return "form";
    }
    @PostMapping("/save")
    public String save(@Valid Client client, Model model){
    	iClientService.save(client);  
     
    	return "redirect:/index";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Optional<Client> client = iClientService.findById(id);
        model.addAttribute("client", client);

      return "form";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id,Model model){
        iClientService.deleteById(id);
       return "redirect:/index";
    }
    

}
