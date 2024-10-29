package cat.tecnocampus.securityjwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class APIController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloAdmin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/helloUser")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/helloUserAdmin")
    public String helloUserAdmin() {
        return "Hello User or Admin";
    }

    @GetMapping("/helloMe")
    public String helloMe(Principal principal) {
        return "Hello " + principal.getName();
    }

    // getMapping /moderator returning the url
    @GetMapping("/moderator")
    public String moderator() {
        return "moderator";
    }

    @GetMapping("/moderator/aaa")
    public String moderatorAaa() {
        return "moderator/aaa";
    }

    @GetMapping("/moderator/bbb")
    public String moderatorBbb() {
        return "moderator/bbb";
    }

    @GetMapping("/moderator/ccc")
    public String moderatorCcc() {
        return "moderator/ccc";
    }

    @GetMapping("/moderator/aaa/admin")
    public String moderatorAaaAdmin() {
        return "moderator/aaa/admin";
    }

    @GetMapping("/moderator/bbb/admin")
    public String moderatorBbbAdmin() {
        return "moderator/bbb/admin";
    }

    @GetMapping("/moderator/ccc/admin")
    public String moderatorCccAdmin() {
        return "moderator/ccc/admin";
    }

    // TODO 2 add a PostMapping to create a new user with a single role. The role must be ADMIN or USER or MODERATOR
    @PostMapping("/createUser")
    public String createUser(@RequestParam String username, @RequestParam String email, @RequestParam String password, @RequestParam String role) {

        // Verifica que el rol sigui vàlid
        if (!role.equals("ADMIN") && !role.equals("USER") && !role.equals("MODERATOR")) {
            return "El rol " + role + " no és vàlid";
        }

        //return userLabService.createUser(username, email, password, role); crear el user
        return null;
    }

}
