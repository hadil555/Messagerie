package tn.essat;

import java.io.IOException;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.essat.configsecurité.JwtService;
import tn.essat.configsecurité.securitemodel.TokenRepository;

public class JwtAuthentificationFilter extends OncePerRequestFilter {


	 private final JwtService jwtService;
	 private final UserDetailsService userDetailsService;
	 private final TokenRepository tokenRepository;
 {

}
@Override
protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	
}
