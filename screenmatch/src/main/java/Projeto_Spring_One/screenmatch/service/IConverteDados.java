package Projeto_Spring_One.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
