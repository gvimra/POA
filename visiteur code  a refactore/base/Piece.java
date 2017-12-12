package batiment.model.base;

import java.util.HashSet;
import java.util.Set;

/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * <p/>
 * Batiment
 * Copyright (C) 2015 Pascal Poizat (@pascalpoizat)
 * emails: pascal.poizat@lip6.fr
 */

public class Piece {
    private final String name;
    private Set<Truc> trucs;

    public Piece(String name) {
        this.name = name;
        this.trucs = new HashSet<Truc>();
    }

    public void ajouter(Truc truc) {
        trucs.add(truc);
    }


    public double prix(){
        return 0;
    }

    public double m3(){
        return 0;
    }

    public void afficher() {
        System.out.println("je suis la piece "+name);
        trucs.stream().forEach(Truc::afficher);
    }
    public void afficher2() {
        trucs.stream().forEach(Truc::afficher2);
        System.out.println("je suis la piece "+name);
    }
}
