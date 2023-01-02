
package com.backend.portafolio.Controller;

import com.backend.portafolio.Model.Usuario;
import com.backend.portafolio.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argentinaprograma-c5128.web.app")
public class UserController {
    @Autowired
    private UserRepo repo;
    
    @PostMapping("/login")
    public ResponseEntity<?> login_User(@RequestBody Usuario userData){
      System.out.println(userData);
      Usuario usuario=repo.findByUserId(userData.getUserId());
      if(usuario.getPassword().equals(userData.getPassword()))
          return ResponseEntity.ok(usuario);
      return(ResponseEntity<?>)ResponseEntity.internalServerError();
    }
}
