package med.voll.api.Voll.Med.controller;

import jakarta.validation.Valid;
import med.voll.api.Voll.Med.domain.usuario.AutenticacaoService;
import med.voll.api.Voll.Med.domain.usuario.DadosLogin;
import med.voll.api.Voll.Med.domain.usuario.Usuario;
import med.voll.api.Voll.Med.infra.security.DadosTokenJwt;
import med.voll.api.Voll.Med.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity login(@RequestBody @Valid DadosLogin dadosLogin) {
        var authenticationTokentoken = new UsernamePasswordAuthenticationToken(dadosLogin.login(), dadosLogin.senha());
        var authentication = manager.authenticate(authenticationTokentoken);
        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());
        return ResponseEntity.ok(new DadosTokenJwt(tokenJWT));
    }
}
