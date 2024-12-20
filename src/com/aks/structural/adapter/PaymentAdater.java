package com.aks.structural.adapter;

public class PaymentAdater {

	public int payFronInrToDoller(int rupee) {
		PaymentProcesser pp = new PaymentProcesserImpl();
		return pp.pay(rupee);
	}
}
