package com.cengiz.springbootprojection.service.impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.cengiz.springbootprojection.data.Personel;
import com.cengiz.springbootprojection.data.PersonelMaasProjection;
import com.cengiz.springbootprojection.repository.PersonelRepository;
import com.cengiz.springbootprojection.service.PersonelService;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonelServiceImpl implements PersonelService {

  private final PersonelRepository personelRepository;

  @Override
  public List<Personel> getByAll() {
    return personelRepository.findAll();
  }

  @Override
  public Optional<Personel> getById(Long id) {
    return personelRepository.findById(id);
  }

  @Override
  public Personel save(Personel personel) {
    personel.setKayitZamani(LocalDateTime.now());
    personel.setIseBaslangicZamani(LocalDateTime.now());
    return personelRepository.save(personel);
  }

  @Override
  public List<PersonelMaasProjection> getAllPersonelMaas() {
    return personelRepository.findAllPersonelMaas();
  }



}
