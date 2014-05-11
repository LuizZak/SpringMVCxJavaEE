/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Luiz Fernando
 */
@Controller
public class TesteController
{
    @RequestMapping("/olaMundoSpring")
    public String execute()
    {
        System.out.println("Executando a lógica com Spring MVC");
        return "/paginaResposta";
    }
    
    @RequestMapping("/requestTest")
    public ModelAndView testeRequest()
    {
        ModelAndView mav = new ModelAndView();
        
        mav.addObject("abc");
        mav.setViewName("/request.htm");
        
        return mav;
    }
}