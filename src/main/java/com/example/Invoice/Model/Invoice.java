package com.example.Invoice.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "INVOICE_MASTER")
public class Invoice implements Serializable {
    @Column(nullable = false, updatable = false, name = "Invoice_Number")
    @Id
    private int invoiceNo;
    @Column(name = "Invoice_Date")
    private String invoiceDate;
    @Column(name = "Travel_Request_Number")
    private int travelReqNo;
    @Column(name = "Guest_name")
    private String guestName;
    @Column(name = "Room_Type")
    private String roomType;
    @Column(name = "Stay_Duration")
    private String stayDuration;
    @Column(name = "Tcs_Cost")
    private float tcsCost;
    @Column(name = "Invoice_Status")
    private String invoiceStatus;
    @Column(name = "Swan_Number")
    private int swonNumber;
    @Column(name = "Booking_Id")
    private int bookingId;
    @Column(name = "Generated_date")
    private Integer generatedDate;
    public Invoice(int invoiceNo, String invoiceDate, int travelReqNo, String guestName, String roomType, String stayDuration,
                   float tcsCost, String invoiceStatus, int swonNumber, int bookingId, Integer generatedDate) {
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.travelReqNo = travelReqNo;
        this.guestName = guestName;
        this.roomType = roomType;
        this.stayDuration = stayDuration;
        this.tcsCost = tcsCost;
        this.invoiceStatus = invoiceStatus;
        this.swonNumber = swonNumber;
        this.bookingId = bookingId;
        this.generatedDate = generatedDate;
    }


    public Invoice()
    {

    }



    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getTravelReqNo() {
        return travelReqNo;
    }

    public void setTravelReqNo(int travelReqNo) {
        this.travelReqNo = travelReqNo;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStayDuration() {
        return stayDuration;
    }

    public void setStayDuration(String stayDuration) {
        this.stayDuration = stayDuration;
    }

    public float getTcsCost() {
        return tcsCost;
    }

    public void setTcsCost(float tcsCost) {
        this.tcsCost = tcsCost;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public int getSwonNumber() {
        return swonNumber;
    }

    public void setSwonNumber(int swonNumber) {
        this.swonNumber = swonNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(Integer generatedDate) {
        this.generatedDate = generatedDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNo=" + invoiceNo +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", travelReqNo=" + travelReqNo +
                ", guestName='" + guestName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", stayDuration='" + stayDuration + '\'' +
                ", tcsCost=" + tcsCost +
                ", invoiceStatus='" + invoiceStatus + '\'' +
                ", swonNumber=" + swonNumber +
                ", bookingId=" + bookingId +
                ", generatedDate=" + generatedDate +
                '}';
    }
}


