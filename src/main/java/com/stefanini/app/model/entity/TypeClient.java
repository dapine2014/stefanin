package com.stefanini.app.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TYPECLIENTS")
public class TypeClient implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    private String name;
}
