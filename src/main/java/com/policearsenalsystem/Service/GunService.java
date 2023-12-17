package com.policearsenalsystem.Service;

import com.policearsenalsystem.Model.Gun;
import com.policearsenalsystem.Model.Returns;
import com.policearsenalsystem.Model.Signup;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface GunService {
    Gun createGun(Gun gun);
    List<Gun> getAllGuns();
    Gun getGunById(UUID id);  // Add this method
    Page<Gun> getAllGunsPageable(int page, int size);
    void updateGun(Gun gun);
    void deleteGun(UUID id);

}
