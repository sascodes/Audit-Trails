package com.sascodes.cass.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {

    @Autowired
    HttpServletRequest request;


    @GetMapping("/get/audits")
    public ResponseEntity<?> getAudits() {
        System.out.println(request.getHeader("X_APP_NAME"));
        return new ResponseEntity<>("audits rendered yaayyy!!!!", HttpStatus.OK);
    }
}
