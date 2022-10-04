package by.airport.entity;

import lombok.*;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airportId;
    @Column
    private String airportName;
    @Column
    private String countryName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId")
    private City cityId;
//    @OneToMany(mappedBy = "arrivalAirportId")
//    private List<Rote> rotesArrival;
//    @OneToMany(mappedBy = "departureAirportId")
//    private List<Rote> rotesDeparture;
}
