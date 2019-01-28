package com.zjs.bwcx.spring.spittr.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.zjs.bwcx.spring.spittr.data.Spitter;
import com.zjs.bwcx.spring.spittr.data.SpitterRepository;
import com.zjs.bwcx.spring.spittr.exception.DuplicateSpittleException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	private SpitterRepository spitterRepository;

	public SpitterController() {
	}

	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute(new Spitter());
		throw new DuplicateSpittleException();
		//return "registForm";
	}

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String processRegistration(MultipartFile profilePicture, @Valid Spitter
	 * spitter, Errors errors,HttpServletRequest rqRequest) throws IOException {
	 * long startTime = System.currentTimeMillis(); if (errors.hasErrors()) { return
	 * "registForm"; } System.out.println("fileName:" +
	 * profilePicture.getOriginalFilename()); String path =
	 * rqRequest.getSession().getServletContext().getRealPath("/")+"/data/spittr/" +
	 * new Date().getTime() + profilePicture.getOriginalFilename();
	 * System.out.println(path); File file = new File(path); if
	 * (!file.getParentFile().exists()) { file.getParentFile().mkdirs(); }
	 * profilePicture.transferTo(file); spitterRepository.save(spitter); long
	 * endTime = System.currentTimeMillis(); System.out.println("所用时间：" +
	 * String.valueOf(endTime - startTime) + "ms"); return "redirect:/spitter/" +
	 * spitter.getUsername(); }
	 */

	/*@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(MultipartFile profilePicture, @Valid Spitter spitter, Errors errors,
			HttpServletRequest rqRequest) throws IOException {
		try {
			long startTime = System.currentTimeMillis();
			if (errors.hasErrors()) {
				return "registForm";
			}
			System.out.println("fileName:" + profilePicture.getOriginalFilename());
			String path = rqRequest.getSession().getServletContext().getRealPath("/") + "/data/spittr/"
					+ new Date().getTime() + profilePicture.getOriginalFilename();
			System.out.println(path);
			File file = new File(path);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			profilePicture.transferTo(file);
			spitterRepository.save(spitter);
			long endTime = System.currentTimeMillis();
			System.out.println("所用时间：" + String.valueOf(endTime - startTime) + "ms");
			return "redirect:/spitter/" + spitter.getUsername();
		} catch (DuplicateSpittleException e) {
			System.out.println(123);
			return "error/duplicate";
		}
	}*/

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(MultipartFile profilePicture, @Valid Spitter spitter, Errors errors,
			HttpServletRequest rqRequest) throws IOException {
		long startTime = System.currentTimeMillis();
		if (errors.hasErrors()) {
			return "registForm";
		}
		System.out.println("fileName:" + profilePicture.getOriginalFilename());
		String path = rqRequest.getSession().getServletContext().getRealPath("/") + "/data/spittr/"
				+ new Date().getTime() + profilePicture.getOriginalFilename();
		System.out.println(path);
		File file = new File(path);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		profilePicture.transferTo(file);
		spitterRepository.save(spitter);
		long endTime = System.currentTimeMillis();
		System.out.println("所用时间：" + String.valueOf(endTime - startTime) + "ms");
		return "redirect:/spitter/1232/" + spitter.getUsername();
	}
	
	@ExceptionHandler(DuplicateSpittleException.class)
	public String handleDuplicateSpittle() {
		return "error/duplicate";
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String username, Model model) {
		Spitter spitter = spitterRepository.getSpitter();
		model.addAttribute(spitter);
		return "profile";
	}
}
