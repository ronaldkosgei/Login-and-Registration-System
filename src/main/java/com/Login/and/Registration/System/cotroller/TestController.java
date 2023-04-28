package com.Login.and.Registration.System.cotroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sample")
public class TestController {

 @GetMapping("run")
 public String getSample(){
     return "Hello";
 }
}
