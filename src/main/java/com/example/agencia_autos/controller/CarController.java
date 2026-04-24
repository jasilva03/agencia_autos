package com.example.agencia_autos.controller;

import com.example.agencia_autos.model.response.CarModelResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars")
public class CarController {

    public ResponseEntity<List<CarModelResponse>> getAllCars() {

        return new ResponseEntity<>(List.of(), HttpStatus.OK);

    }


}
