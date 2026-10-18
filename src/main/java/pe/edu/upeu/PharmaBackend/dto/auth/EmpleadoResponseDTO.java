package pe.edu.upeu.PharmaBackend.dto.auth;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

