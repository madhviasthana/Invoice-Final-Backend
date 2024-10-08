package com.example.Invoice.Service;

import com.example.Invoice.Model.Invoice;
import com.example.Invoice.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.getAllInvoices();
    }

    public Object[] getInvoiceUsingId(Integer id) {

        return invoiceRepository.getInvoiceById(id);
    }

    public List<Invoice> getFilteredInvoice(String cityName, String hotelName) {
        return invoiceRepository.findByCityAndHotel(cityName, hotelName);
    }

    public List<Invoice> getFilteredInvoiceByDate(String startDate, String endDate) {
        return invoiceRepository.findByStartDateAndEndDate(startDate, endDate);
    }

    public void updateStatusOfInvoice(Integer invoiceId) {
        Invoice invoice = invoiceRepository.getById(invoiceId);
        invoice.setInvoiceStatus("approved");
        invoiceRepository.save(invoice);
    }


}
