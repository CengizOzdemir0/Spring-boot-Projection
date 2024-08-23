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

import com.cengiz.springbootprojection.data.Personel;
import com.cengiz.springbootprojection.data.PersonelMaasProjection;
import com.cengiz.springbootprojection.service.PersonelService;

@RestController
@RequestMapping("/personel")
@RequiredArgsConstructor
public class PersonelController {

  private final PersonelService personelService;


  @GetMapping()
  public ResponseEntity<List<Personel>> getByAll(){
    return  ResponseEntity.ok(personelService.getByAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Personel>> getById(@PathVariable Long id){
    return  ResponseEntity.ok(personelService.getById(id));
  }

  @PostMapping
  public ResponseEntity<Personel> save(@RequestBody Personel personel) {
    return ResponseEntity.ok(personelService.save(personel));
  }

  @GetMapping("/all")
  public ResponseEntity<List<PersonelMaasProjection>> getAllPersonelMaas() {
    return ResponseEntity.ok(personelService.getAllPersonelMaas());
  }

}
