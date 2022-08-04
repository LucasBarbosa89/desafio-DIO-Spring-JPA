package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Preencha corretamente o campo.")
  @Positive(message = "O ID do aluno precisa ser maior que 0")
  private Long alunoId;

  @Digits(integer = 3, fraction = 2, message = "Apenas centenas e 2 casas decimais.")
  @Positive(message = "Não existe peso negativo")
  private double peso;

  @Digits(integer = 3, fraction = 0, message = "Altura em cm!")
  @Positive(message = "Não existe altura negativa")
  private double altura;
}
