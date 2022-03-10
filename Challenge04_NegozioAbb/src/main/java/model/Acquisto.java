package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Acquisto {

	private int id;
	private LocalDateTime data;
	private List<Prodotto> prodotti;

	public Acquisto() {
		this.prodotti = new ArrayList<Prodotto>();
	}

	public Acquisto(int id, LocalDateTime data, List<Prodotto> prodotti) {
		this();
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acquisto [id=");
		builder.append(id);
		builder.append(", data=");
		builder.append(data);
		builder.append(", prodotti=");
		builder.append(prodotti);
		builder.append("]");
		return builder.toString();
	}

}
