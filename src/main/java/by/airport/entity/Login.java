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
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginId;
    @Column
    public String visitorLogin;
    @Column
    private String visitorPass;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visitorId")
    private Visitor visitorId;
}
