package ma.emsi.backend.controllers;

import ma.emsi.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.emsi.backend.services.UtilisateurService;


@RestController
@RequestMapping("/api/users")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User utilisateur) {
        return ResponseEntity.ok(utilisateurService.registerUser(utilisateur));
    }
}

