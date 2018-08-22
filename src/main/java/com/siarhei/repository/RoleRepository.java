package com.siarhei.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.siarhei.model.Role;

@RepositoryRestResource
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

}
