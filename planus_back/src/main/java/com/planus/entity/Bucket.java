package com.planus.entity;

import javax.persistence.*;

@Entity
public class Bucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bucket_id")
    private long bucketId;

    @Column(name="place")
    private String place;

    @Column(name="address")
    private String address;

    @Column(name="lat")
    private double lat;

    @Column(name="lng")
    private double lng;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="trip_id")
    private Trip trip;

}
