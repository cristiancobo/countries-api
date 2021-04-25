package com.api.countries.utils.exceptions;

/**
 * Class representing a exception when user try to find a country that does not exist
 * @version 1.0
 */
public class CountryDoesNotExistException extends RuntimeException {
    public CountryDoesNotExistException(String message) {
        super(message);
    }
}