package com.project.MealBooking.Repository;

import com.project.MealBooking.Entity.MealBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface MealBookingRepository extends JpaRepository <MealBooking, Long>{
    boolean existsByBookingDateAndUserId(LocalDate bookingDate, Long userId);

    List<MealBooking> findByBookingDate(LocalDate bookingDate);

    @Query("SELECT b FROM MealBooking b WHERE b.bookingDate = :bookingDate AND b.email = :email")
    MealBooking findByBookingDateAndEmail(LocalDate bookingDate, String email);
}
