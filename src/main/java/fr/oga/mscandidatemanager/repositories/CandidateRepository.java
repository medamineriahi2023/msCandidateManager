package fr.oga.mscandidatemanager.repositories;

import fr.oga.mscandidatemanager.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Long> {
}
