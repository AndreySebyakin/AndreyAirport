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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column
    private String cityName;
//    @OneToMany(mappedBy = "cityId", cascade = CascadeType.ALL)
//    private List<Airport> airports;
}
