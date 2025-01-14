package com.harish;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalulatorController{

    @PostMapping("/calculate")
    public CalculationResult calculate(@RequestBody CalculationRequest request){

        double result;
        
        switch(request.getOperation()){

            case "add":
                result = request.getNumber1()+request.getNumber2();
                break;
            case "subtract":
                result = request.getNumber1()-request.getNumber2();
                break;
            case "multiply":
                result = request.getNumber1()*request.getNumber2();
                break;
            case "divide":
                result = request.getNumber1()/request.getNumber2();
                break;   
            default:
                throw new IllegalArgumentException("Invalid Operation");    
        }

        return new CalculationResult(result);
    }
    
}