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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="typeClient", referencedColumnName = "id")
    private TypeClient typeClient;
}
