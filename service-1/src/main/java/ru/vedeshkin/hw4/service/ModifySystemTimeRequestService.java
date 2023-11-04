package ru.vedeshkin.hw4.service;

import org.springframework.stereotype.Service;
import ru.vedeshkin.hw4.model.Request;
import ru.vedeshkin.hw4.util.DateTimeUtil;

import java.util.Date;

@Service
public class ModifySystemTimeRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
    }
}
