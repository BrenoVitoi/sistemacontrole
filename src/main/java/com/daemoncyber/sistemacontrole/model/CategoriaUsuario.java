package com.daemoncyber.sistemacontrole.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    private Long id;
    private String descricao;

}
