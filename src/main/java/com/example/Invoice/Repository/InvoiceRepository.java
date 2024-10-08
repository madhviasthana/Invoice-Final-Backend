package com.example.Invoice.Repository;


import com.example.Invoice.Model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    @Query(value = "select i.invoice_number,i.booking_id,i.guest_name,i.invoice_date,i.invoice_status," +
            "i.room_type,i.stay_duration,i.swan_number,i.tcs_cost,i.travel_request_number,i.generated_date " +
            "from invoice_master as i left join city_tbl as c on i.invoice_number=c.invoice_id" +
            " join hotel_tbl as h on i.invoice_number=h.invoice_id where c.city_name=:cityName" +
            " and h.hotel_name=:hotelName", nativeQuery = true)
    List<Invoice> findByCityAndHotel(String cityName, String hotelName);

    @Query(value = "select i.invoice_number,i.booking_id,i.guest_name,i.invoice_date,i.invoice_status," +
            "i.room_type,i.stay_duration,i.swan_number,i.tcs_cost,i.travel_request_number,i.generated_date " +
            "from invoice_master as i where i.generated_date >=:startDate and i.generated_date<=:endDate",
            nativeQuery = true)
    List<Invoice> findByStartDateAndEndDate(String startDate, String endDate);


    @Query(value = "select  i.invoice_number, i.booking_id,i.guest_name," +
            "i.invoice_date, i.invoice_status, " +
            " i.room_type, i.stay_duration, i.swan_number, i.tcs_cost, " +
            "i.travel_request_number,c.city_name,h.hotel_name," +
            " b.amount,b.billing_address, b.billing_instruction,b.cgst, " +
            "b.sgst from invoice_master as i join city_tbl as" +
            "  c on i.invoice_number=c.invoice_id join hotel_tbl as h on" +
            " i.invoice_number=h.invoice_id join billing_tbl as  b on i.invoice_number=b.invoice_id" +
            " where i.invoice_number=:invoiceNo", nativeQuery = true)
    Object[] getInvoiceById(Integer invoiceNo);

    @Query(value = "select i.invoice_number,i.booking_id,i.generated_date, " +
            "i.guest_name,i.invoice_date,i.invoice_status," +
            "i.room_type,i.stay_duration, i.swan_number, i.tcs_cost, " +
            "i.travel_request_number from invoice_master as i " +
            "where invoice_status!='approved'", nativeQuery = true)
    List<Invoice> getAllInvoices();
//
//    @Query(value = "update invoice_master as i set i.invoice_status='pending' where invoice_number=:id",
//            nativeQuery = true)
//    void updateByInvoiceNo(Integer id);

}


