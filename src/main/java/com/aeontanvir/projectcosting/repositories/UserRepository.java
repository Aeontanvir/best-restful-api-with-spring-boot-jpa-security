package com.aeontanvir.projectcosting.repositories;

import com.aeontanvir.projectcosting.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}