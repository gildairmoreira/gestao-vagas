package br.com.gildairmoreira.gestaovagas.exceptions;

public class UserFoundExeption extends RuntimeException{
    public UserFoundExeption(){
        super("Ususario Já existe");
    }
}
