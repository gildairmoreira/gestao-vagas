package br.com.gildairmoreira.gestaovagas.exceptions;

public class UserFoundExeption extends RuntimeException{
    public UserFoundExeption(){
        super("Usuario Já existe");
    }
}
