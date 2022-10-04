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
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visitorId;
    @Column
    private String visitorName;
    @Column
    private String visitorSername;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passportId")
    private Passport passportId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId")
    private Role roleId;
//    @OneToOne
//    @PrimaryKeyJoinColumn
//    private Login login;
//    @OneToMany(mappedBy = "visitorId", cascade = CascadeType.ALL)
//    private List<Ticket> tickets;
}
