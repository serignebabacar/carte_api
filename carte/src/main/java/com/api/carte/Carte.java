package com.api.carte;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Carte implements Serializable, Comparable<Carte> {
    private String couleur;
    private String valeur;

    @Override
    public int compareTo(Carte autreCarte) {
        int i = couleur.compareTo(autreCarte.getCouleur());
        return i != 0 ? i : valeur.compareTo(autreCarte.getValeur());
    }
}