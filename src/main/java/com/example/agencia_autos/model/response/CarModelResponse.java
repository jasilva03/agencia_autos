package com.example.agencia_autos.model.response;

public record CarModelResponse(
        long id,
        String manufacturer,
        String model,
        int year,
        int price
) {
}
