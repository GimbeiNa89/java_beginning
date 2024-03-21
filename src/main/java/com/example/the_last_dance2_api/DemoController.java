package com.example.the_last_dance2_api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
@RequestMapping (path = "/math")
public class DemoController {

    @Autowired
    NumLogRepository repository;

    @GetMapping (path = "/sum/{num1}/{num2}")
    public @ResponseBody int getSum (@PathVariable Integer num1, @PathVariable Integer num2) {

        int sum = num1 + num2;

        Numlog result = new Numlog("SUM", sum, new numberRequest(num1, num2), null);

        // Save the NumLog entity to the database
        repository.save(result);

        return sum;

    }

    @GetMapping (path = "/product")
    public @ResponseBody int getProduct (@RequestParam Integer num1, @RequestParam Integer num2) {

        int multip = num1 * num2;

        Numlog result = new Numlog("Product", multip, new numberRequest(num1, num2), null);

        // Save the NumLog entity to the database
        repository.save(result);

        return multip;
    }

    @GetMapping (path = "/division")
    public @ResponseBody int getDivision (@RequestBody numberRequest request) {
        int num1 = request.getNum1();
        int num2 = request.getNum2();
        int divis = num1 / num2;
        Numlog result = new Numlog("DIVISION", divis, new numberRequest(num1, num2), null);

        // Save the NumLog entity to the database
        repository.save(result);

        return divis;
    }

}

