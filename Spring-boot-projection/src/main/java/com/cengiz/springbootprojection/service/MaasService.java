package com.cengiz.springbootprojection.service;

import java.util.List;
import java.util.Optional;

import com.cengiz.springbootprojection.data.Maas;

public interface MaasService {

  List<Maas> getByAll();

  Optional<Maas> getById(Long id);

  Maas save(Maas maas);
}
