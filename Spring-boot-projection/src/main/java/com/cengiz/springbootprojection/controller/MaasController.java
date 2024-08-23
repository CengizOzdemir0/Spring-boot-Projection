package com.cengiz.springbootprojection.controller;


import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cengiz.springbootprojection.data.Maas;
import com.cengiz.springbootprojection.service.MaasService;

@RestController
@RequestMapping("/maas")
@RequiredArgsConstructor
public class MaasController {

  private final MaasService maasService;


  @GetMapping
  public ResponseEntity<List<Maas>> getByAll() {
    return ResponseEntity.ok(maasService.getByAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Maas>> getById(@PathVariable Long id) {
    return ResponseEntity.ok(maasService.getById(id));
  }

  @PostMapping
  public ResponseEntity<Maas> save(@RequestBody Maas maas) {
    return ResponseEntity.ok(maasService.save(maas));
  }

}
