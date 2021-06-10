package com.example.Invoice.Controller;

import com.example.Invoice.Model.Invoice;
import com.example.Invoice.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InvoiceController {
    @Autowired
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }


    @GetMapping("/invoices")
    public ResponseEntity<List<Invoice>> getAllInvoice() {
        List<Invoice> invoices = invoiceService.getAllInvoices();
        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }
    @GetMapping(value = "/invoices/{id}", produces = {"application/json"})
    public ResponseEntity<Object[]> getInvoiceById(@PathVariable(value = "id") Integer invoiceNo) {
        return new ResponseEntity<>(invoiceService.getInvoiceUsingId (invoiceNo), HttpStatus.OK);
    }
    @PostMapping(value = "/filtered_invoices1")
    public ResponseEntity<List<Invoice>> getFilteredInvoices(@RequestParam String cityName,
                                                             @RequestParam String hotelName)
    {
        List<Invoice> filteredInvoices=invoiceService.getFilteredInvoice(cityName,hotelName);
        return new ResponseEntity<>(filteredInvoices, HttpStatus.OK);

    }
    @PostMapping(value = "/filtered_invoices2",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Invoice>> getFilteredInvoicesByDate(@RequestParam String startDate,
                                                                   @RequestParam String endDate)

    {
        List<Invoice> filteredInvoices=invoiceService.getFilteredInvoiceByDate(startDate, endDate);
        return new ResponseEntity<>(filteredInvoices, HttpStatus.OK);

    }
    @GetMapping("/invoice-update/{id}")
    public ResponseEntity<Invoice> updateInvoiceStatus(@PathVariable(value = "id") Integer invoiceNo)
    {
        invoiceService.updateStatusOfInvoice(invoiceNo);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}





