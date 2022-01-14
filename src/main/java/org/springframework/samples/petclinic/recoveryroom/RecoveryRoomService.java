package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {

    @Autowired
    private RecoveryRoomRepository recoveryRoomRepository;

    public List<RecoveryRoom> getAll(){
        return this.recoveryRoomRepository.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return this.recoveryRoomRepository.findAllRecoveryRoomTypes();
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        return this.recoveryRoomRepository.getRecoveryRoomType(typeName);
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
        return this.recoveryRoomRepository.findBySizeMoreThan(size);
    }

    @Transactional
    public RecoveryRoom save(RecoveryRoom p) {
        return this.recoveryRoomRepository.save(p);       
    }

    
}
