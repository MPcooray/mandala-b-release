package com.mandala.repository;

import com.mandala.models.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    Optional<Receipt> findByOrderId(Long orderId);
}
