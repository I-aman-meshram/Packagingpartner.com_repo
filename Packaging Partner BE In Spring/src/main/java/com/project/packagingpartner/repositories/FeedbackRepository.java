package com.project.packagingpartner.repositories;

import com.project.packagingpartner.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
