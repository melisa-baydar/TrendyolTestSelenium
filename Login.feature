@Tag
Feature: Trendyoldan sepete ekleme işlemi

@Tag1

Scenario Outline: Trendyolda urun ekleme
    When Trendyola giris yapilir
    When User gets the title of the page   
    When Popup kapatilir 
    When urun aranir
    When arama butonuna tiklanir
    When daha fazla goster
    When Dongu olusturulur
    When random urun secilir
    When Sepete eklenir
    When Sepete girilir
    When Sepete git tiklanir
    When Sepet temizlenir
    When Sepetten sil secilir
   