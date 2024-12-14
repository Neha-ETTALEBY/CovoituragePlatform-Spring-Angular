package services;

import ma.emsi.backend.models.Message;
import ma.emsi.backend.models.User;
import ma.emsi.backend.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public User registerUser(User utilisateur) {
        utilisateur.setMotDePasse(new BCryptPasswordEncoder().encode(utilisateur.getMotDePasse()));
        return utilisateurRepository.save(utilisateur);
    }

}
