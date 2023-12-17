package com.policearsenalsystem.repo;



import com.policearsenalsystem.Model.Gun;
import com.policearsenalsystem.Model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RequestRepo extends JpaRepository<Request, UUID> {

    Request findRequestsById(UUID id);
}
