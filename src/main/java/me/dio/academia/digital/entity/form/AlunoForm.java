package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Nome preenchido incorretamente!")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa está entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "cpf preenchido incorretamente!")
  //@CPF(message = "'${validatedValue}' é inválido.")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente!")
  @Size(min = 3, max = 50, message = "${validatedValue} precisa está entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente!")
  @Past(message = "Data '${validatedValue}' é inválida!")
  private LocalDate dataDeNascimento;
}
