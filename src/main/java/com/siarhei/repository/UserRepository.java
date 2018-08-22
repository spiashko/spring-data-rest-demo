package com.siarhei.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.siarhei.model.User;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
