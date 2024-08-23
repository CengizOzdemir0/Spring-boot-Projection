package com.cengiz.springbootprojection.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;



@Entity
@Table(name = "maas", schema = "personel")
@Getter
@Setter
public class Maas extends BaseDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "fk_personel_id")
  private Long fkPersonelId;

  @Column(name = "maas")
  private Long maas;


  @Column(name = "kayit_zamani")
  private LocalDateTime kayitZamani;

}
