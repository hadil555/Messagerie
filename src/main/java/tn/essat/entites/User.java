package tn.essat.entites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import tn.essat.configsecuritémodel.*;
import tn.essat.entites.User;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")

public class User implements UserDetails {
	private Long id;
	private String nom;
	private String Username;
	private String password;
	@Enumerated(EnumType.STRING)
	private Erole role;
	@OneToMany(mappedBy = "user")
	List<Messagereiceived> messagereiceived=new ArrayList<>();
	@OneToMany(mappedBy = "user")
	List<Messagesend> messagesend=new ArrayList<>();
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(role.name()));
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return Username;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
