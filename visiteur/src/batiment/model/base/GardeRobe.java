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

package batiment.model.base;

import java.util.HashSet;
import java.util.Set;

public class GardeRobe implements Truc {
    public Set<Vetement> vetements;

    public GardeRobe() {
        this.vetements = new HashSet<Vetement>();
    }

    public void ajouter(Vetement vetement) {
        vetements.add(vetement);
    }

    public double prix(){
        return 0;
    }

    public double m3(){
        return 0;
    }
/*
    @Override
    public void afficher() {
        System.out.println("je suis une garde robe");
        vetements.stream().forEach(Vetement::afficher);
    }
    @Override
    public void afficher2() {
        vetements.stream().forEach(Vetement::afficher2);
        System.out.println("je suis une garde robe");
    }
*/
    @Override
    public void accept(Visiteur v) {

    }
}
