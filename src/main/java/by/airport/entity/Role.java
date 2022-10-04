package by.airport.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
    @Column
    private String roleName;
//    @OneToMany(mappedBy = "roleId")
//    private List<Visitor> visitors;
}
