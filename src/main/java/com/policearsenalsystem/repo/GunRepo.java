package com.policearsenalsystem.repo;



import com.policearsenalsystem.Model.Gun;
import com.policearsenalsystem.Model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GunRepo extends JpaRepository<Gun, UUID> {

    Gun findGunById(UUID id);
    Gun findGunByRegistrationNumber(String registrationNumber);
}
