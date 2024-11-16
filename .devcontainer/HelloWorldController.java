create_hello_world.py
import os

controller_path = "./src/main/java/com/example/helloworld"
os.makedirs(controller_path, exist_ok=True)

content = """
package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}
"""
with open(f"{controller_path}/HelloWorldController.java", "w") as file:
    file.write(content)

print("HelloWorldController.java created!")
