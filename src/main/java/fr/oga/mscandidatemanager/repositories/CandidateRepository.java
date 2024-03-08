package fr.oga.mscandidatemanager.repositories;

import fr.oga.mscandidatemanager.entities.Condidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Condidat,Long> {
}
