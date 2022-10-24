package com.maakoul.billingservice.mappers;


import com.maakoul.billingservice.dto.InvoiceRequestDTO;
import com.maakoul.billingservice.dto.InvoiceResponseDTO;
import com.maakoul.billingservice.entities.Invoice;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    Invoice fromInvoiceRequestDTO(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO fromInvoice(Invoice invoice);
}
