package com.aks.structural.adapter;

public class PaymentApp {

	public int pay(int rupees) {
		PaymentAdater pd = new PaymentAdater();
		int doller = pd.payFronInrToDoller(rupees);
		return doller;
	}
}
