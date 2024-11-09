package com.quostomize.lotto.entity;

import jakarta.persistence.*;

@Entity
@Table(name="lotto_application_records")
public class LottoApplicationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lotto_application_record_id")
    private Long lottoApplicationRecordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;

}
