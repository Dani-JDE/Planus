package com.planus.db.repository;

import com.planus.db.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member save(Member member);
    List<Member> findByTripTripId(long tripId);
    boolean existsByTripTripIdAndUserUserId(long tripId, long userId);
    Long countByTripTripId(long tripId);

    void deleteByTripIdAndUserId(long tripId, long userId);
}
