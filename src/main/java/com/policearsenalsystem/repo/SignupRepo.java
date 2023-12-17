package com.policearsenalsystem.repo;


import com.policearsenalsystem.Model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SignupRepo extends JpaRepository<Signup, UUID> {

    public Signup findSignupByPoliceNumber(Integer policeNumber);
    public Signup findByUsernameAndPassword(String username, String password);
    Signup findSignupById(UUID id);


}
