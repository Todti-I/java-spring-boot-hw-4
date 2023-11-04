package ru.vedeshkin.hw4.service;

import org.springframework.stereotype.Service;
import ru.vedeshkin.hw4.model.Request;

@Service
public class ModifySourceRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSource("service-1");
    }
}
