package com.qa.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.tracker.entity.Showing;

@Repository
public interface ShowingRepository extends JpaRepository<Showing, Integer> {
}
