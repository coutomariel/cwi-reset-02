package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.DiretorEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiretoresRepository {

    static List<DiretorEntity> diretores = new ArrayList<>();
    static Long nextId = 1L;

    public List<DiretorEntity> getDiretores(){
        return diretores;
    }

    public Long addDiretor(DiretorEntity diretor){
        diretor.setId(nextId);
        diretores.add(diretor);
        nextId++;
        return diretor.getId();
    }

    public DiretorEntity findById(Long id) {
        for (DiretorEntity diretor: this.diretores){
            if(diretor.getId().equals(id)){
                return diretor;
            }
        }
        return null;
    }
}
