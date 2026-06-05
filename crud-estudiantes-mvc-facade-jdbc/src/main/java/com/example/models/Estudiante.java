package com.example.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;

@Builder
public record Estudiante(
		int id,
		String nombre,
		String primerApellido,
		String segundoApellido,
		LocalDate fechaAlta,
		Genero genero,
		BigDecimal becaConcedida,
		int Facultades_id) {

}
