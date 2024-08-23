package com.cengiz.springbootprojection.data;


import java.time.LocalDateTime;

public interface PersonelMaasProjection {


   String getAdi();

   String getSoyadi();

   LocalDateTime getIseBaslangicZamani();

   Long getFkPersonelId();

   Long getMaas();

}
