package edu.utez.supermercado.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utez.supermercado.Entities.Cliente;
import edu.utez.supermercado.Repository.CajaRepository;
import edu.utez.supermercado.Repository.ClienteRepository;
@Service
public class CajaService {
    private Queue<String> filaClientes = new LinkedList<>();

    public String agregarCliente(String nombre) {
        filaClientes.add(nombre);
        return "Cliente agregado a la fila: " + nombre;
    }

    public String atenderCliente() {
        if (filaClientes.isEmpty()) {
            return "No hay clientes en la fila.";
        }
        String cliente = filaClientes.poll();
        return "Atendiendo al cliente: " + cliente;
    }

    public List<String> obtenerFila() {
        return new ArrayList<>(filaClientes);
    }
}


