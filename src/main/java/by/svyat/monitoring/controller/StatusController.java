package by.svyat.monitoring.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/{status:\\d+}")
    public ResponseEntity<String> getStatus(@PathVariable Integer status) {
        var statusCode = HttpStatusCode.valueOf(status);
        return new ResponseEntity<>(String.format("Status code is %s", status), statusCode);
    }

}
