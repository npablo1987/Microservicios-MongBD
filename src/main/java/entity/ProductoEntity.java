package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "producto")
@Getter
@Setter
@NoArgsConstructor
public class ProductoEntity {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private Double precio;
}
