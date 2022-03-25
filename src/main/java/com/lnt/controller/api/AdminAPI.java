package com.lnt.controller.api;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.Admin;
import com.lnt.service.AdminService;



@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/Admin")

public class AdminAPI {
	@Autowired
private AdminService adminService;
	
	HttpSession session;
	@PostMapping(value = "/login")
public boolean login(@RequestBody Admin admin) {
		System.out.println("logg in");
		System.out.println(admin.getUserName());
		System.out.println(admin.getPassword());
	if(admin.getUserName().equals("Rishi") && admin.getPassword().equals("1234"))
		return true;
	else
		return false;
}
	@RequestMapping
	public List<Admin> getAllAdmins() {
		return adminService.getAllAdminService();
	}
	@RequestMapping("/{id}")
	public Admin findAdminById(@PathVariable int id) {
		return adminService.searchAdminByIdService(id);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT )
	public void updateAdmin(@RequestBody Admin a,@PathVariable int id) {
		//customerService.addCustomerService(c);
		adminService.updateAdminService(a, id);
	}
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public void addNewAdmin(@RequestBody Admin a) {
		System.out.println(a.getUserName());
		adminService.addAdminService(a);
	}
	
}