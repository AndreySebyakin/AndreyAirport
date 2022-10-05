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
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    @Column
    private int ticketNumber;
    @Column
    private String flightDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routeId")
    private Route routeId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Customer customerId;
}
