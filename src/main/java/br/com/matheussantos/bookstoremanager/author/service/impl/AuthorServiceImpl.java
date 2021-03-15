package br.com.matheussantos.bookstoremanager.author.service.impl;

import br.com.matheussantos.bookstoremanager.author.mapper.AuthorMapper;
import br.com.matheussantos.bookstoremanager.author.repository.AuthorRepository;
import br.com.matheussantos.bookstoremanager.author.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
