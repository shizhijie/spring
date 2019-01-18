package com.zjs.bwcx.spring.spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zjs.bwcx.spring.spittr.data.Spittle;
import com.zjs.bwcx.spring.spittr.data.SpittleRepository;

@Controller
@ComponentScan("com.zjs.bwcx.spring.spittr.data")
@RequestMapping("/spittles")
public class SpittleController {
	
	//private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);

	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

	/*
	 * @RequestMapping(method = RequestMethod.GET) public String spittles(Model
	 * model) { model.addAttribute("spittleList",
	 * spittleRepository.findSpittles(Long.MAX_VALUE, 20)); return "spittles"; }
	 */

	/*
	 * @RequestMapping(method = RequestMethod.GET) public String
	 * spittles(Map<String, List<?>> model) { model.put("spittleList",
	 * spittleRepository.findSpittles(Long.MAX_VALUE, 20)); return "spittles"; }
	 */

	/*@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles() {
		return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
	}*/

	/*
	 * @RequestMapping(method = RequestMethod.GET) public List<Spittle>
	 * spittles(@RequestParam("max") long max, @RequestParam("count") int count) {
	 * return spittleRepository.findSpittles(max, count); }
	 */

	@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = "9223372036854775807") long max,
			@RequestParam(value = "count", defaultValue = "20") int count) {
		return spittleRepository.findSpittles(max, count);
	}
	
	/*@RequestMapping(value="/{spittled}",method=RequestMethod.GET)
	public String spittle(@PathVariable("spittled") long spittled,Model model) {
		return "home";
	}*/
	
	@RequestMapping(value="/{spittled}",method=RequestMethod.GET)
	public String spittle(@PathVariable long spittled,Model model) {
		model.addAttribute(spittleRepository.findOne(spittled));
		return "spittle";
	}
	
}