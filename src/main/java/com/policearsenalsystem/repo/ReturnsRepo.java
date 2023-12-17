package com.policearsenalsystem.repo;



import com.policearsenalsystem.Model.Gun;
import com.policearsenalsystem.Model.Returns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReturnsRepo extends JpaRepository<Returns, UUID> {

    Returns findReturnsById(UUID id);

}

