package br.com.analiseesportiva.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class homepage {

	  //  @GetMapping("/index")
	    public class HomeContoller {
	        @RequestMapping("/")
	        public String index() {
	            return "index";
	        }
	    
	    //public ResponseEntity<String> get()
	//    public String get(){
	  //     return "index.html";
	    	
	    	
	    	//return new ResponseEntity<>("Respondendo Ok", HttpStatus.OK);
	    }
	   
	    
}

