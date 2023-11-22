package com.example.Java_practise_15.controllers;


import com.example.Java_practise_15.MYSQL.User;
import com.example.Java_practise_15.MYSQL.UserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository; //Для БД

    @GetMapping("/")
    public String maga(Model model) {
        model.addAttribute("name", "Главная страница");
        return "maga";
    }

    @GetMapping("/advantages")
    public String advantages(Model model) {
        model.addAttribute("name", "Главная страница");
        return "advantages";
    }

    @GetMapping("/about")
    public String about(Model model) {
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "about-add";
    }

    @PostMapping("/about")
    public String aboutPost(@RequestParam Integer cardNumber,@RequestParam String expirationDate, @RequestParam String cvv, @RequestParam Integer promoCode, Model model){
        User user = new User(cardNumber,expirationDate, cvv, promoCode);
        userRepository.save(user);
        return "about-add";
    }

    @GetMapping("/career")
    public String career(Model model) {
        model.addAttribute("name", "Главная страница");
        return "career";
    }

    @GetMapping("/python")
    public String python(Model model) {
        model.addAttribute("name", "Главная страница");
        return "python";
    }


    /*@PostMapping(path="/about") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam Integer number, @RequestParam String data, @RequestParam String name, @RequestParam Integer cvv) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setNumber(number);
        n.setData(data);
        n.setName(name);
        n.setCvv(cvv);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }*/
}
