package com.quostomize.lotto.batch;

import com.quostomize.lotto.repository.LottoWinnerRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Builder
@RequiredArgsConstructor
public class DailyLotto {
    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;

    private final MemberRepository memberRepository;
    private final LottoWinnerRepository lottoWinnerRepository;

}
