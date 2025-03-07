package com.example.kursach_server.repository;

import com.example.kursach_server.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {
    List<Review> findByTourIdOrderByReviewDateDesc(UUID tourId);
    Optional<Review> findFirstByUserEmailOrderByReviewDateDesc(String email);
}
