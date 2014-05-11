/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import sp.senac.model.Veiculo;
import sp.senac.service.VeiculoService;

/**
 *
 * @author Luiz Fernando
 */
@Controller
@RequestMapping("/veiculo")
public class VeiculoController
{
    @Autowired
    VeiculoService veiculoService;
    
    @RequestMapping("/principal")
    public String mostrarPaginaPrincipal()
    {
        return "/veiculo/principal";
    }
    
    @RequestMapping("/novo")
    public String novoVeiculo()
    {
        return "/veiculo/novoVeiculo";
    }
    
    /**
     * Requisição feita ao submeter o formulário da página novoVeiculo.jsp.
     * A anotação @ModelAttribute("veiculo") no parâmetro 'veiculo' captura o
     * veículo que foi preenchido no formulário, e é necessária na lista de
     * parâmetros da função
     * 
     * @param veiculo
     * @param bindingResult
     * @return 
     */
    @RequestMapping(value="/adicionar", method = RequestMethod.POST)
    public String adicionarVeiculo(@ModelAttribute("veiculo")Veiculo veiculo, BindingResult bindingResult)
    {
        veiculoService.adicionarVeiculo(veiculo);
        return "redirect:listar.htm";
    }
    
    @RequestMapping("/listar")
    public ModelAndView listarVeiculos(Model model)
    {
        model.addAttribute("veiculos", veiculoService.listarVeiculos());
        
        return new ModelAndView("veiculo", "command", new Veiculo());
    }
    
    /**
     * Método chamado na página novoVeiculo.jsp no form, utilizado para atribuir
     * um veículo como alvo de preenchimento dos dados do formulário
     * @return 
     */
    @ModelAttribute("novoVeiculo")
    public Veiculo createModel() {
        return new Veiculo();
    }
}