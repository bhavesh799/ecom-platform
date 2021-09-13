package com.techienukkad.ecomplatfrom.dto.response;

import com.techienukkad.ecomplatfrom.dto.ErrorDto;
import lombok.Data;

import java.util.List;

@Data
public class GenericResponse<T> {

    private String status;
    private String message;
    private T data;
    private List<ErrorDto> errors;
}
