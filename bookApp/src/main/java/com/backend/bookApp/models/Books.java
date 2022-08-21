package com.backend.bookApp.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="b_id")
	private int id;
	private String bName;
	private String bDescription;
	private String bAuthor;
	private String bImage;
	
	
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "book")
    private List<Favourites> favourite;
	
	
}
