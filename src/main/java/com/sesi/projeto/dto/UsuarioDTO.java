package com.sesi.projeto.dto;

import com.sesi.projeto.entities.Usuario;

public record UsuarioDTO(String email, String senha, String telefone, String nome) {

    public Usuario criarUSer(){
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTelefone(telefone);
        usuario.setNome(nome);
        return usuario;
    }
}
