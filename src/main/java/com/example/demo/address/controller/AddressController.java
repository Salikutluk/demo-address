package com.example.demo.address.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    public static List<Address> addresses = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Address>> addresses() {
        return ResponseEntity.ok(addresses);
    }

    @PostMapping
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        addresses.add(address);
        return ResponseEntity.ok(address);
    }
}
