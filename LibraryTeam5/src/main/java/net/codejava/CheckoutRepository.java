package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
	@Query("SELECT c FROM Checkout c WHERE c.email = ?1")
	public Checkout findByEmail(String email);
	
}
