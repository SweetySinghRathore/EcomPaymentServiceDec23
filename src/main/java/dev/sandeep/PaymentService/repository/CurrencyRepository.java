package dev.sandeep.PaymentService.repository;

import dev.sandeep.PaymentService.entity.Currency;
import dev.sandeep.PaymentService.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, UUID> {
}
