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
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airCompanyId;
    @Column
    private String airCompanyName;
//    @OneToMany(mappedBy = "airCompanyId", cascade = CascadeType.ALL)
//    private List<Rote> rotes;
}
