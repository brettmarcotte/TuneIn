package com.example.TuneIn.Controllers;


import com.example.TuneIn.Repositories.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listeners")
public class ListenerController {

    @Autowired
    private ListenerRepository listenerRepository;

    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("Welcome to TuneIn", HttpStatus.OK);
    }

    //Create, Read, Update, Delete
    //Create = POST
    //Read = GET
    //Update = PUT* POST
    //Delete = DELETE
    
}
