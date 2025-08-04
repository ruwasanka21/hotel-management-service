package com.cpd.hotel_system.hotel_management_service_api.utill;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponsedto {
    private int code;
    private String message;
    private Object data;


}
