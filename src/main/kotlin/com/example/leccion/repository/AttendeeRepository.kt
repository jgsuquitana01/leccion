package com.example.leccion.repository

import com.example.leccion.model.Attendee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
    interface AttendeeRepository:JpaRepository<Attendee, Long> {
        fun findById(id: Long?): Attendee?
    }
