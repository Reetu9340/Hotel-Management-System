package com.jwt.dao;

import java.util.List;

import com.jwt.model.Payment;


public interface PaymentDAO {

public void addPayment(Payment payment);
	
	public List<Payment> getAllPayments();

	public void deletePayment(Integer paymentId);

	public Payment updatePayment(Payment payment);

	public Payment getPayment(int paymentid);
}
