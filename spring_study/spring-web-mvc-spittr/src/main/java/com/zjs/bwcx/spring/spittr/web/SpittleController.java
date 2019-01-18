package com.zjs.bwcx.spring.spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zjs.bwcx.spring.spittr.data.Spittle;
import com.zjs.bwcx.spring.spittr.data.SpittleRepository;

@Controller
@ComponentScan("com.zjs.bwcx.spring.spittr.data")
@RequestMapping("/spittles")
public class SpittleController {

	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}


	/*@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}*/
	
	/*@RequestMapping(method = RequestMethod.GET)
	public String spittles(Map<String, List<?>> model) {
		model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}*/
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles() {
		return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
	}
}