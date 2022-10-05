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
    public String customerLogin;
    @Column
    private String customerPass;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId", unique = true)
    private Customer customerId;
}
