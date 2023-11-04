package ru.vedeshkin.hw4.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.vedeshkin.hw4.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
