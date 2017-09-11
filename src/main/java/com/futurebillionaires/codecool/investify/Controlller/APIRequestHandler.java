package com.futurebillionaires.codecool.investify.Controlller;

import com.futurebillionaires.codecool.investify.Database.DBHandler;
import com.futurebillionaires.codecool.investify.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIRequestHandler {

    private DBHandler dbHandler;

    @Autowired
    public APIRequestHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    ResponseEntity<?> saveToDB(@RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam String username,
                               @RequestParam String email,
                               @RequestParam String password) {
        System.out.println(firstName);
        if (dbHandler.findByEmail(email).size() > 0) {
            return ResponseEntity.unprocessableEntity().build();
        }
        dbHandler.save(new User(firstName, lastName, username, email, password));
        return ResponseEntity.ok().build();
    }

//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public String authenticate(@RequestParam(value="email") String email,
//                               @RequestParam(value = "password") String password) throws URISyntaxException {
//        for (User emoLogUser : dbHandler.findByEmail(email)) {
//            if (emoLogUser.getPassword().equals(password)) {
//                String data = "{\"loggedIn\":true,\"user\":{\"id\":"+emoLogUser.getId()+",\"email\":\""+email+"\",\"firstName\":\""+emoLogUser.getFirstName()+"\",\"lastName\":\""+emoLogUser.getLastName()+"\"}}";
//                URI location = new URI ("/authenticate");
//                HttpHeaders responseHeaders = new HttpHeaders();
//                responseHeaders.setLocation(location);
//                return ResponseEntity.created(location).header("MyResponseHeader", "MyValue").body(data);
//            }
//        }
//        return "{\"loggedIn\":false}";
//    }
//    @RequestMapping("/delete")
//    public String deleteUsers() {
//
//        dbHandler.deleteAll();
//        return "All users deleted";
//    }

}