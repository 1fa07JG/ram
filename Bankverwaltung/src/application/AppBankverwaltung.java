package application;

import java.util.HashMap;

import ausgabe.IAusgabe;
import ausgabe.Konsolausgabe;
import klassen.KontoStamm;
import eingabe.Dateieingabe;
import eingabe.Datenbankeingabe;
import eingabe.IEingabe;
import eingabe.Dateieingabe;

public class AppBankverwaltung {
public static void main(String[] args) {
	IEingabe eingabe= new Dateieingabe();
	IAusgabe ausgabe= new Konsolausgabe();
	
	//System.out.println(eingabe);
	HashMap<Integer, KontoStamm> konten = eingabe.konten();
	ausgabe.konten(konten);
	//System.out.println(konten.size());
	
}
}
