package com.cpd.hotel_system.hotel_management_service_api.advise;

import com.cpd.hotel_system.hotel_management_service_api.exception.EntryNotFoundException;
import com.cpd.hotel_system.hotel_management_service_api.utill.StandardResponsedto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandller {
    public ResponseEntity<StandardResponsedto> handleEntryNotFoundException(EntryNotFoundException ex) {
        return new ResponseEntity<>(
                new StandardResponsedto(404, ex.getMessage(), ex)
                , HttpStatus.NOT_FOUND
        );
    }
}
