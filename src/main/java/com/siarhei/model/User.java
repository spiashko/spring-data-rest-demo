package com.siarhei.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @NotBlank
  private String name;

  @ManyToMany
  private List<Role> roles;
}
