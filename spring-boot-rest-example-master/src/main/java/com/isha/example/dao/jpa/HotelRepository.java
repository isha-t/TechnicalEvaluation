package com.isha.example.dao.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isha.example.domain.Hotel;


public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> {
    Hotel findHotelByCity(String city);
    Page findAll(Pageable pageable);
}
