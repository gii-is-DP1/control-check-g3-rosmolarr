package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer>{
    List<RecoveryRoom> findAll();

    @Query("SELECT r from RecoveryRoomType r")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
    Optional<RecoveryRoom> findById(int id);

    @Query("SELECT r from RecoveryRoomType r WHERE r.name =?1")
    RecoveryRoomType getRecoveryRoomType(String name);

    @Query("SELECT r from RecoveryRoom r WHERE r.size >?1")
    List<RecoveryRoom> findBySizeMoreThan(double size);
}
