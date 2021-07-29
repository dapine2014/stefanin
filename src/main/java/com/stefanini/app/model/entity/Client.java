package com.stefanini.app.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTS")
public class Client implements Serializable {
	private static final long serialVersionUID = 4033773932194076261L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",unique = true)
    private Long id;
    @Column(name = "Identification")
    private int idClient;
    @Column(name = "Name")
    private String nameClient;
    @Column(name = "BusinessName")
    private String businessName;
    @Column(name = "Contact")
    private String contact;
    @Column(name = "Location")
    private String location;
    @Column(name = "TypeClient")
    private String typeClient;
}
