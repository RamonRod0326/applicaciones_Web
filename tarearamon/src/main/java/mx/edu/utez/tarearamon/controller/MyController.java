package mx.edu.utez.tarearamon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {

    private static final String NOMBRE = "Ramón Rodriguez Memije";

    @GetMapping("/fizzbuzz/{n}")
    public Map<String, String> fizzBuzz(@PathVariable int n) {
        for (int i = 1; i <= n; i++) {
            String texto = "";
            if (i % 3 == 0) texto += "Fizz";
            if (i % 5 == 0) texto += "Buzz";
            System.out.println(texto.isEmpty() ? String.valueOf(i) : texto);
        }
        return Map.of("respuesta", NOMBRE);
    }

    @GetMapping("/fibonacci/{n}")
    public Map<String, String> fibonacci(@PathVariable int n) {
        long anterior = 0;
        long actual = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(anterior);
            long siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
        return Map.of("respuesta", NOMBRE);
    }
}