package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Reservation;

public interface ScoreORepository extends CrudRepository<Reservation, Long> {
    
}
