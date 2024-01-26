package br.com.gildairmoreira.gestaovagas.exceptions;

public class JobNotFoundException extends RuntimeException {
    public JobNotFoundException() {
        super("Job Not Found");
    }
}