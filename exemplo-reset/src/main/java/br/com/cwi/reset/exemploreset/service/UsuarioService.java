package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.exception.UsuarioNotFoundException;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.getUsuarios();
    }

    public Usuario criarUsuario(Usuario usuario){
        if(usuario.getNome() == null || usuario.getEmail() == null || usuario.getSenha() == null){
            throw new BadRequestException("Um ou mais campos inválidos");
        }
        return usuarioRepository.adicionarUsuario(usuario);
    }

    public void deletarUsuario(Integer id) {
        Usuario usuarioExistente = usuarioRepository.buscarUsuarioPeloId(id);
        if (usuarioExistente==null){
            throw new UsuarioNotFoundException("Usuário não encontrado");
        }
        usuarioRepository.deletarUsuario(id);
    }


    public Usuario atualizarUsuario(Integer id, Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.buscarUsuarioPeloId(id);
        if (usuarioExistente==null){
            throw new UsuarioNotFoundException("Usuário não encontrado");
        }
        return usuarioRepository.atualizarUsuario(id, usuario);
    }
}
