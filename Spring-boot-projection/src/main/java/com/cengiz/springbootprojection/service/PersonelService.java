package com.cengiz.springbootprojection.service;

import java.util.List;
import java.util.Optional;

import com.cengiz.springbootprojection.data.Personel;
import com.cengiz.springbootprojection.data.PersonelMaasProjection;

public interface PersonelService {


  List<Personel> getByAll();

  Optional<Personel> getById(Long id);

  Personel save(Personel personel);

  List<PersonelMaasProjection> getAllPersonelMaas();
}
