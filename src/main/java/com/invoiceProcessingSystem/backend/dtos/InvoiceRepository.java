package com.invoiceProcessingSystem.backend.dtos;

import com.invoiceProcessingSystem.backend.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}