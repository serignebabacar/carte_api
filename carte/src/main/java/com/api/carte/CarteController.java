package com.api.carte;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("api/carte")
public class CarteController {
    private final Random random = new Random();

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = {"", "/all"})
    public ResponseEntity<List<Carte>> getMain() {
        List<String> couleurs = List.of("Carreaux", "Coeur", "Pique", "Trèfle");
        List<String> valeurs = List.of("As", "5", "10", "8", "6", "7", "4", "2", "3", "9", "Dame", "Roi", "Valet");
        List<Carte> cartes = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Carte carte = new Carte(couleurs.get(random.nextInt(couleurs.size())), valeurs.get(random.nextInt(valeurs.size())));
            cartes.add(carte);
        }
        return ResponseEntity.ok(cartes);
    }
}
