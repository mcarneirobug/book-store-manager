package br.com.matheussantos.bookstoremanager.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass // indica que é uma classe mapeada que pode ser extendida por qualquer uma entidade do projeto
@EntityListeners(AuditingEntityListener.class) // é salva toda vez que é inserida ou adicionada uma data
public abstract class Auditable {

    @CreatedDate
    @Column(nullable = false)
    protected LocalDateTime createdDate;

    @LastModifiedDate
    @Column
    protected LocalDateTime lastModifiedDate;

}
