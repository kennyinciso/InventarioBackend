package pe.edu.upeu.PharmaBackend.dto;



import lombok.*;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RolResponseDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private List<String> permisos;
}