package pe.edu.upeu.PharmaBackend.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EmpleadoResponseDTO {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String cargo;
    private String email;
    private String telefono;
    private Boolean estado;
    private boolean tieneUsuario;
}