package com.example.zerobase;

import com.example.zerobase.domain.ZerobaseCourse;
import com.example.zerobase.domain.ZerobaseCourseRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class Homework {
    private final ZerobaseCourseRepository repository;

    // TODO: 테스트가 통과할 수 있도록 아래 메서드 들을 작성하세요.
    private List<ZerobaseCourse> zerobaseCourseList;
    private List<ZerobaseCourse> result = new ArrayList<ZerobaseCourse>();

    public Optional<ZerobaseCourse> getZerobaseCourse(Long id) {
        // TODO: id 가 일치하며, hidden = false 인 강의만 조회되어야 함
        zerobaseCourseList = repository.findAll();

        if (zerobaseCourseList.contains(id)) {
            return !repository.findById(id).isHidden() ? Optional.of(repository.findById(id)) : Optional.empty();
        }

        return Optional.empty();
    }

    public List<ZerobaseCourse> getZerobaseCourse(String status) {
        // TODO: status가 일치하고, hidden = false 인 강의들이 조회되어야 함
        zerobaseCourseList = repository.findAll();

        for (ZerobaseCourse zb : zerobaseCourseList) {
            if (zb.getStatus().equals(status) && !zb.isHidden()) {
                result.add(zb);
            }
        }

        return result;
    }

    public List<ZerobaseCourse> getOpenZerobaseCourse(LocalDate targetDt) {
        // TODO: status = "OPEN" 이고, hidden = false 이며,
        // startAt <= targetDt && targetDt <= endAt 인 강의만 조회되어야함.
        zerobaseCourseList = repository.findAll();

        for (ZerobaseCourse zb : zerobaseCourseList) {
            if (zb.getStatus().equals("OPEN") && !zb.isHidden()) {
                if (zb.getStartAt().isBefore(targetDt) && zb.getEndAt().isAfter(targetDt)) {
                    result.add(zb);
                }
            }
        }

        return result;
    }
}