package com.todolist.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.IdentityHashMap;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

}

