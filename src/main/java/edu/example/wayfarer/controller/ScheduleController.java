package edu.example.wayfarer.controller;

import edu.example.wayfarer.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ScheduleController {
    private final SimpMessagingTemplate template;

}
