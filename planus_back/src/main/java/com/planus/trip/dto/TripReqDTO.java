package com.planus.trip.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class TripReqDTO {
    private String startDate;
    private long period;
    private int[] areaId;

    public TripReqDTO(String startDate, long period, int[] areaId) {
        this.startDate = startDate;
        this.period = period;
        this.areaId = areaId;
    }
}
