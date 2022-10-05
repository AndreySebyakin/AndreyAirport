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
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routeId;
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
//    @OneToMany(mappedBy = "routeId", cascade = CascadeType.ALL)
//    private List<Ticket> tickets;
}
