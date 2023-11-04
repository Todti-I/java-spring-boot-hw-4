package ru.vedeshkin.hw4.service;

import org.springframework.stereotype.Service;
import ru.vedeshkin.hw4.model.Request;
import ru.vedeshkin.hw4.model.Systems;

@Service
public class ModifySystemNameRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSystemName(Systems.Service1);
    }
}
