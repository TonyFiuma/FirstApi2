package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController{
    @GetMapping("/{n}")
    public int factorial(@PathVariable int n){
        int result = 1;
        for(int i = 1 ; i <= n ; i++){
            result *= i;
        }
        return result;
    }
}