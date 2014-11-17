/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leona.wscliente_leona.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin_2
 */
@Resource
public class IndexController { 
    private final Result _result;
    
        
    public IndexController(Result _result){
        this._result = _result; 
    }  
   
       
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){    
        
        String moveleft = "IMOVEL";
        if(MoveLeft("10")==1) moveleft = "10"+"LEFT";
        else moveleft = "IMOVEL";
        
         _result  
                .include("moveleft", moveleft)          
                .forwardTo("index.jsp");                
    }    
    
    int MoveLeft(String graus){
        try { // Call Web Service Operation
            br.leona.estacao.controller.ControllerServices_Service service = new br.leona.estacao.controller.ControllerServices_Service();
            br.leona.estacao.controller.ControllerServices port = service.getControllerServicesPort();
            // TODO initialize WS operation arguments here
            // TODO process result here
            int result = port.moverEsquerda(graus);
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println("ERRO : "+ex);
            return 0;
        }
    }
}
