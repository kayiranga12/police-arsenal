package com.policearsenalsystem.Service;

import com.policearsenalsystem.Model.Gun;
import com.policearsenalsystem.Model.Request;
import com.policearsenalsystem.Model.Returns;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface RequestService {
    Request createRequest(Request request);
    public List<Request> getAllRequests();
    public Request getRequestById(UUID id);
    Page<Request> getAllRequestsPageable(int page, int size);
    void updateRequest(Request request);
    void deleteRequest(UUID id);
}
