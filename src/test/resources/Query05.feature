Feature: Database üzerinden transport_route tablosuna yeni bir kayıt eklenebilmeli.

  @query05
  Scenario: Transport_route tablosuna yeni veri ekleme testi.


    * Database baglantisi kurulur.
    * UpdateQuery`si hazirlanir ve transport_route tablosuna execute edilir.
    * Database baglantisi kapatilir.