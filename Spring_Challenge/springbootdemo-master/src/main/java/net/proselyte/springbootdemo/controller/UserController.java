//package net.proselyte.springbootdemo.controller;
//
//import net.proselyte.springbootdemo.model.User;
//import net.proselyte.springbootdemo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@Controller
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/countries")
//    public String findAll(Model model){
//        List<User> users = userService.findAll();
//        model.addAttribute("countries", users);
//        return "country-list";
//    }
//
//    @GetMapping("/country-create")
//    public String createUserForm(User user){
//        return "country-create";
//    }
//
//    @PostMapping("/country-create")
//    public String createUser(User user){
//        userService.saveUser(user);
//        return "redirect:/countries";
//    }
//
//    @GetMapping("country-delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id){ //id
//        userService.deleteById(id);
//        return "redirect:/countries";
//    }
//
//    @GetMapping("/country-update/{id}")
//    public String updateUserForm(@PathVariable("id") Long id, Model model){ //id
//        User user = userService.findById(id);
//        model.addAttribute("country", user);
//        return "country-update";
//    }
//
//    @PostMapping("/country-update")
//    public String updateUser(User user){
//        userService.saveUser(user);
//        return "redirect:/countries";
//    }
//}
