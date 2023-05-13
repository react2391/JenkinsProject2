package com.base.Controller;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test 
{
	@CrossOrigin
	@GetMapping("/test")
	public ResponseEntity<Map<String,String>> test()
	{
		System.out.println("Its Working");
		return ResponseEntity.ok(Map.of("response","Working"));
	}
}