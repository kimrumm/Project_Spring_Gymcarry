package com.project.gymcarry.payment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("payment/payment")
public class PaymentController {
	
	@GetMapping
	public String matching() {
		return "payment/payment";
	}
	
	
}