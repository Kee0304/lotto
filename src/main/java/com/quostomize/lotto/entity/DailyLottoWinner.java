package com.quostomize.lotto.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "daily_lotto_winners")
public class DailyLottoWinner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lotto_winner_id")
    private Long lotto_winner_id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Long Customer;

}
