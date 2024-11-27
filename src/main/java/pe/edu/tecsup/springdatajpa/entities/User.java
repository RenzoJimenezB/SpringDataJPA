package pe.edu.tecsup.springdatajpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "roles_id")
    private Role role;

    private String email;
    private String password;

    @Column(name = "nombres")
    private String name;

    @Column(name = "apellidos")
    private String lastname;

    @Column(name = "sexo")
    private String gender;

    @Column(name = "fecnacimiento")
    private Date birthdate;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "direccion")
    private String address;

    @Column(name = "estado")
    private String state;
}
