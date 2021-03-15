package br.com.matheussantos.bookstoremanager.author.mapper;

import br.com.matheussantos.bookstoremanager.author.dto.AuthorDTO;
import br.com.matheussantos.bookstoremanager.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
