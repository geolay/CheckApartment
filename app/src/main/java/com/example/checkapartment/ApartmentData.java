package com.example.checkapartment;

import java.util.ArrayList;
import java.util.List;

public class ApartmentData {
    public List<Apartment> apartmentList() {
        List<Apartment> apartmentList = new ArrayList<>();
        Apartment apartment01 = new Apartment("Edificio Paseo Andino","Torre 1", "depto 102", "Av. Santa Teresa 737, Los Andes.", "http://www.terrandino.cl/img/perspectiva.jpg");
        Apartment apartment02 = new Apartment("Edificio Paseo Andino","Torre 1", "depto 204", "Av. Santa Teresa 737, Los Andes.", "http://www.terrandino.cl/img/perspectiva.jpg");
        Apartment apartment03 = new Apartment("Edificio Paseo Andino","Torre 1", "depto 302", "Av. Santa Teresa 737, Los Andes.", "http://www.terrandino.cl/img/perspectiva.jpg");
        Apartment apartment04 = new Apartment("Edificio Paseo Andino","Torre 1", "depto 402", "Av. Santa Teresa 737, Los Andes.", "http://www.terrandino.cl/img/perspectiva.jpg");
        Apartment apartment05 = new Apartment("Edificio Monte Blanco","Torre A", "depto 202", "Av. Santa Teresa 656, Los Andes", "https://www.solari.cl/wp-content/uploads/2020/08/CDH_3718-400x600.jpg");
        Apartment apartment06 = new Apartment("Edificio Monte Blanco","Torre A", "depto 301", "Av. Santa Teresa 656, Los Andes", "https://www.solari.cl/wp-content/uploads/2020/08/CDH_3718-400x600.jpg");
        Apartment apartment07 = new Apartment("Edificio Monte Blanco","Torre A", "depto 302", "Av. Santa Teresa 656, Los Andes", "https://www.solari.cl/wp-content/uploads/2020/08/CDH_3718-400x600.jpg");
        Apartment apartment08 = new Apartment("Edificio Monte Blanco","Torre A", "depto 402", "Av. Santa Teresa 656, Los Andes", "https://www.solari.cl/wp-content/uploads/2020/08/CDH_3718-400x600.jpg");
        Apartment apartment09 = new Apartment("Edificio Monte Blanco","Torre A", "depto 502", "Av. Santa Teresa 656, Los Andes", "https://www.solari.cl/wp-content/uploads/2020/08/CDH_3718-400x600.jpg");
        Apartment apartment10 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 101", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        Apartment apartment11 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 102", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        Apartment apartment12 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 103", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        Apartment apartment13 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 104", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        Apartment apartment14 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 201", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        Apartment apartment15 = new Apartment("Edificio Andes Los Leones","Torre 1", "depto 202", "Los Leones 2006, Providencia", "http://andeslosleones.cl/img/fotos/edificio-andesleones01-b.jpg");
        apartmentList.add(apartment01);
        apartmentList.add(apartment02);
        apartmentList.add(apartment03);
        apartmentList.add(apartment04);
        apartmentList.add(apartment05);
        apartmentList.add(apartment06);
        apartmentList.add(apartment07);
        apartmentList.add(apartment08);
        apartmentList.add(apartment09);
        apartmentList.add(apartment10);
        apartmentList.add(apartment11);
        apartmentList.add(apartment12);
        apartmentList.add(apartment13);
        apartmentList.add(apartment14);
        apartmentList.add(apartment15);

        return apartmentList;
    }
}
