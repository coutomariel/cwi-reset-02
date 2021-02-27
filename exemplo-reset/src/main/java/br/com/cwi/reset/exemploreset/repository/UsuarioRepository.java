package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    static int nextId;

    private List<Usuario> usuarios;

    public UsuarioRepository(List<Usuario> usuarios) {
        this.usuarios = new ArrayList<>();
        this.nextId = 1;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario adicionarUsuario(Usuario usuario){
        usuario.setId(nextId);
        this.usuarios.add(usuario);
        nextId++;
        return usuario;

    }

    public Usuario buscarUsuarioPeloId(Integer id) {
        for(Usuario usuario: this.usuarios){
            if(usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public void deletarUsuario(Integer id) {
        for(Usuario usuario: this.usuarios){
            if(usuario.getId().equals(id)){
                this.usuarios.remove(usuario);
                break;
            }
        }
    }

    public Usuario atualizarUsuario(Integer id, Usuario usuarioAtualizado) {
        for(Usuario usuario: this.usuarios){
            if(usuario.getId().equals(id)){
                usuario.setEmail(usuarioAtualizado.getEmail());
                usuario.setNome(usuarioAtualizado.getNome());
                usuario.setSenha(usuario.getSenha());
                break;
            }
        }
        return usuarioAtualizado;
    }
}
