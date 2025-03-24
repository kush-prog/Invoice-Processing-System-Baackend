package com.invoiceProcessingSystem.backend.services;

import com.invoiceProcessingSystem.backend.dtos.InvoiceRepository;
import com.invoiceProcessingSystem.backend.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
        return invoice;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceRepository.findById(id).get();
        invoiceRepository.delete(invoice);
        return invoice;
    }
}
