package com.micro.payroll_api.resource;

import com.micro.payroll_api.domain.Payroll;
import com.micro.payroll_api.domain.User;
import com.micro.payroll_api.feignClients.UserFeign;
import com.micro.payroll_api.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;
    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
            return ResponseEntity.ok().body(service.getPayment(workerId,payment));
    }

}
