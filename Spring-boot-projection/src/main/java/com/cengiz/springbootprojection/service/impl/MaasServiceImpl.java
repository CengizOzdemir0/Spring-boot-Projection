package com.cengiz.springbootprojection.service.impl;


import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cengiz.springbootprojection.data.Maas;
import com.cengiz.springbootprojection.repository.MaasRepository;
import com.cengiz.springbootprojection.service.MaasService;

@Service
@RequiredArgsConstructor
public class MaasServiceImpl implements MaasService {

  private final MaasRepository maasRepository;

  @Override
  public List<Maas> getByAll() {
    return maasRepository.findAll();
  }

  @Override
  public Optional<Maas> getById(Long id) {
    return maasRepository.findById(id);
  }

  @Override
  public Maas save(Maas maas) {
    maas.setKayitZamani(LocalDateTime.now());
    return maasRepository.save(maas);
  }

}
