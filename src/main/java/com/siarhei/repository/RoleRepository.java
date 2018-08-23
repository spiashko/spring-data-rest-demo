package com.siarhei.repository;

import com.siarhei.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

}
