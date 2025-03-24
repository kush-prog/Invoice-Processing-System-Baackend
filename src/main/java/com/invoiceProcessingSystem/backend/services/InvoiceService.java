package com.invoiceProcessingSystem.backend.services;

import com.invoiceProcessingSystem.backend.models.Invoice;
import java.util.List;

public interface InvoiceService {

    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();

    public Invoice deleteInvoice(long id);
}
