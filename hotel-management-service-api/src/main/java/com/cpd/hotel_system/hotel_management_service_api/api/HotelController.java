package com.cpd.hotel_system.hotel_management_service_api.api;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.utill.StandardResponsedto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {
    private final HotelService hotelService;

    @PostMapping("/user/create")
    public ResponseEntity<StandardResponsedto> create(
            @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.create(dto);
        return new ResponseEntity<>(new StandardResponsedto(
                201,"Hotel Saved!",null
        ), HttpStatus.CREATED);
    }

    @PutMapping("/admin/update/{id}")
    public ResponseEntity<StandardResponsedto> update(
            @PathVariable("id") String hotelId,
            @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.update(dto, hotelId);
        return new ResponseEntity<>(new StandardResponsedto(
                201,"Hotel Updated!",null
        ), HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<StandardResponsedto> delete(
            @PathVariable("id") String hotelId) throws SQLException {
        hotelService.delete(hotelId);
        return new ResponseEntity<>(new StandardResponsedto(
                204,"Hotel Deleted!",null
        ), HttpStatus.CREATED);
    }

    @GetMapping("/visitor/find-by-id/{id}")
    public ResponseEntity<StandardResponsedto> findById(
            @PathVariable("id") String hotelId) throws SQLException {

        return new ResponseEntity<>(new StandardResponsedto(
                204,"Hotel Found!",hotelService.findById(hotelId)
        ), HttpStatus.CREATED);
    }

}
