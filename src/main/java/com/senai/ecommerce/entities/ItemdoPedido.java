package com.senai.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tb_ItemDoPedido")
public class ItemdoPedido {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;	
private int  Quantidade;
private double preco;
public ItemdoPedido(int quantidade, double preco) {
	
	Quantidade = quantidade;
	this.preco = preco;
}
public int getQuantidade() {
	return Quantidade;
}
public void setQuantidade(int quantidade) {
	Quantidade = quantidade;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}

}
