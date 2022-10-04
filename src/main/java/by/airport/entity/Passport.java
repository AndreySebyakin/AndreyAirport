package by.airport.entity;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passportId;
    @Column
    private String passportNumber;
//    @OneToOne
//    @PrimaryKeyJoinColumn
//    private Visitor visitor;
}
