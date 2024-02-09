package com.app.demo.repo;

import com.app.demo.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AccountRepo extends JpaRepository<Account,Integer> {
    Optional<Account> findByCustId(Integer custId);
}
