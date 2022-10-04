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
public class Rote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roteId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrivalAirportId")
    private Airport arrivalAirportId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DepartureAirportId")
    private Airport departureAirportId;
    @Column
    private int cost;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airCompanyId")
    private AirCompany airCompanyId;
//    @OneToMany(mappedBy = "roteId", cascade = CascadeType.ALL)
//    private List<Ticket> tickets;
}
