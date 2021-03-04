package de.die_gfi.jonathan.shop;

public class Customer {
	Purchase buying = new Purchase();
	String surename;
	String name;
	String mail;
	String country;
	String location;
	String street;
	int house;

	public Customer(String s, String n) {
		surename = s;
		name = n;
		// mail=m; vorübergehend vereinfacht_,String m
		mail = n + "." + s + "@shop.com";
	}
// Set adress
	public void setAdress(String land, String ort, String Straße, int haus) {
		country = land;
		location = ort;
		street = Straße;
		house = haus;
	}

	public String toString() {
		return name + " " + surename + " " + mail;
	}
// zeilenweise Ausgabe der Produkte
	public void printPurchase() {
		System.out.println(this);
		buying.printPurchase();

	}
// ein Purchase Item hinzufügen
	public void addPurchaseItem(PurchaseItem objekt) {
		this.buying.addItem(objekt);
	}

	//erstellt eine Rechnung unter nennung des Produktnamens
	public double rechnungErstellen() {
		System.out.println("Rechnung:");
		double summ=buying.getItems();
		System.out.println("________________");
		System.out.println(summ+"  Gesamtpreis");
		return summ;
	}

}
