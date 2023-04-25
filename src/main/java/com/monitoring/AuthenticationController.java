package com.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/")
public class AuthenticationController {

    private final UserSessionMetrics userSessionMetrics;

    private AtomicInteger activeSessions = new AtomicInteger(0);

    public AuthenticationController(UserSessionMetrics userSessionMetrics) {
        this.userSessionMetrics = userSessionMetrics;
    }

    @GetMapping("/login")
    public void login() {
        activeSessions.incrementAndGet();
        userSessionMetrics.incrementActiveSessions();
        System.out.println(activeSessions + " : active sessions");
    }

    @GetMapping("/logout")
    public void logout() {
        activeSessions.decrementAndGet();
        userSessionMetrics.decrementActiveSessions();
        System.out.println(activeSessions + " : active sessions");
    }
}