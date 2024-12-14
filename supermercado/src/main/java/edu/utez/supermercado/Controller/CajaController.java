package edu.utez.supermercado.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.utez.supermercado.Entities.Cliente;
import edu.utez.supermercado.Service.CajaService;

@RestController
@RequestMapping("/caja")
public class CajaController {
    @Autowired
    private CajaService cajaService;

    @PostMapping("/agregar")
    public String agregarCliente(@RequestParam String nombre) {
        return cajaService.agregarCliente(nombre);
    }

    @GetMapping("/atender")
    public String atenderCliente() {
        return cajaService.atenderCliente();
    }

    @GetMapping("/obtenerFila")
    public List<String> obtenerFila() {
        return cajaService.obtenerFila();
    }
}
