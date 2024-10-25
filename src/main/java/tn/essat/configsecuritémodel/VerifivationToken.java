package tn.essat.configsecuritémodel;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.apache.catalina.User;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.essat.configsecurité.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "registration_token")

public class VerifivationToken {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private String token;
	   private Date expirationTime;


	   private static final int EXPIRATION_TIME = 1;


	   @OneToOne
	   @JoinColumn(name = "user_id")
	   private User user;


	   @CreationTimestamp
	   @Column(name = "created_at")
	   private LocalDateTime createdAt;




	   public VerifivationToken(String token, User user) {
	       super();
	       this.token = token;
	       this.user = user;
	       this.expirationTime = this.getTokenExpirationTime();
	   }


	   public Date getTokenExpirationTime() {
	       Calendar calendar = Calendar.getInstance();
	       calendar.setTimeInMillis(new Date().getTime());
	       calendar.add(Calendar.MINUTE, EXPIRATION_TIME);
	       return new Date(calendar.getTime().getTime());
	   }


}
