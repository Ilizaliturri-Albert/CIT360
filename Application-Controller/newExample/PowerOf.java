
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author co075oh
 */
public class PowerOf implements HandleMath {
    
    public void execute(Integer num1, Integer num2) {
        double sum = Math.pow(num1, num2);
        System.out.println(sum);
    }
    
}