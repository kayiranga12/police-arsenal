package com.policearsenalsystem.Service.Impl;

import com.policearsenalsystem.Model.Returns;
import com.policearsenalsystem.Service.ReturnsService;
import com.policearsenalsystem.repo.ReturnsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReturnsServiceImpl implements ReturnsService {
    @Autowired
    ReturnsRepo returnsRepo;
    @Override
    public Returns createReturns(Returns returns) {
        return returnsRepo.save(returns);
    }

    @Override
    public List<Returns> getAllReturn() {
        return returnsRepo.findAll();
    }

    @Override
    public Returns getReturnById(UUID id) {
        return returnsRepo.findById(id).orElse(null);
    }

    @Override
    public Page<Returns> getAllReturnsPageable(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return returnsRepo.findAll(pageable);
    }

    @Override
    public void updateReturn(Returns returns) {
        returnsRepo.save(returns);
    }

    @Override
    public void deleteReturn(UUID id) {
     returnsRepo.deleteById(id);
    }
}
