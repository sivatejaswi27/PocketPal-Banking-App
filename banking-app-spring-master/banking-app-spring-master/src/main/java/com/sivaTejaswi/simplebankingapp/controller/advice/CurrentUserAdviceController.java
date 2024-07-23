package com.sivaTejaswi.simplebankingapp.controller.advice;

import com.sivaTejaswi.simplebankingapp.auth.CustomUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CurrentUserAdviceController {

    @ModelAttribute("currentUser")
    public CustomUserDetails getCurrentUser(
            @AuthenticationPrincipal CustomUserDetails customUserDetails) {
        return customUserDetails;
    }
}
