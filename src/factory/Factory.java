package factory;

public abstract interface Factory <T> {

    T cria (String tipo);
}