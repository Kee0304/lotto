package com.quostomize.lotto.repository;

import com.quostomize.lotto.entity.LottoWinner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LottoWinnerRecordRepository extends JpaRepository<LottoWinner, Long> {
}
