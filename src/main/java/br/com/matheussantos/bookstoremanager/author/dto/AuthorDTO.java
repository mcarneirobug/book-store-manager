package br.com.matheussantos.bookstoremanager.author.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

    @JsonProperty("id")
    private Long id;

    @NotNull
    @NotEmpty
    @Size(max = 255)
    @JsonProperty("name")
    private String name;

    @NotNull
    @Max(120)
    @JsonProperty("age")
    private Integer age;
}
