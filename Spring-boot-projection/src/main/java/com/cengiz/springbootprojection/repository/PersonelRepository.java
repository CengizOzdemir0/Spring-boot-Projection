package com.cengiz.springbootprojection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cengiz.springbootprojection.data.Personel;
import com.cengiz.springbootprojection.data.PersonelMaasProjection;


public interface PersonelRepository extends JpaRepository<Personel,Long> {

  @Query("SELECT p.adi as adi, p.soyadi as soyadi, p.iseBaslangicZamani as iseBaslangicZamani, "
      + " m.fkPersonelId as fkPersonelId, m.maas as maas FROM Personel p join Maas m on p.id = m.fkPersonelId")
  List<PersonelMaasProjection> findAllPersonelMaas();
}
