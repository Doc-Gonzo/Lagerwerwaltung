package at.kamadesign.Lagerverwaltung;

import at.kamadesign.Lagerverwaltung.model.Regal;
import at.kamadesign.Lagerverwaltung.model.Regalfach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class LagerverwaltungApplication {

	public static void main(String[] args) {
		SpringApplication.run(LagerverwaltungApplication.class, args);

		Regal regal = new Regal(1,8,8);
		Regal regal2 = new Regal(2,12,12);

		for (Regalfach fach: regal.getRegal_faecher()) {
			int reihe  = fach.getFach_regal_reihe();
			int spalte  = fach.getFach_regal_spalte();
			System.out.println("Reihe " + reihe + " Spalte " + spalte);
		}

		for (Regalfach fach: regal2.getRegal_faecher()) {
			int reihe  = fach.getFach_regal_reihe();
			int spalte  = fach.getFach_regal_spalte();
			System.out.println("Reihe " + reihe + " Spalte " + spalte);
		}


	}
}
