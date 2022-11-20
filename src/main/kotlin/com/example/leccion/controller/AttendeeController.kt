package com.example.leccion.controller

import com.example.leccion.model.Attendee
import com.example.leccion.service.AttendeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/attendee")
class AttendeeController {

    @Autowired
    lateinit var attendeeService: AttendeeService

    @GetMapping
    fun list():List<Attendee>{
        return attendeeService.list()
    }

    @PostMapping
    fun save(@RequestBody attendee: Attendee): Attendee?{
        return attendeeService.save(attendee)

    }

}

