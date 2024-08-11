package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String nome, @NotBlank String classificacao, @NotBlank String tipo, @NotNull BigDecimal preco,@NotNull BigDecimal tamanho) {
}
