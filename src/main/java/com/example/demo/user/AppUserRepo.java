package com.example.demo.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepo {

    @Query("SELECT s FROM AppUser a WHERE s.email = ?1")
    Optional<AppUser> findByUserByEmail(String email);
}
