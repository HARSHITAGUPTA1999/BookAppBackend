package com.backend.bookApp.models;






import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Favourites {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="f_id")
	private int id;
	private String rating;
	
    
	@OneToOne(targetEntity = Users.class)
    @JoinColumn (name = "user_id",nullable = false)
    private Users user;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Books book;
	
    public Favourites(Users user, Books book) {
        this.user = user;
        this.book = book;
        
    }
	


}
