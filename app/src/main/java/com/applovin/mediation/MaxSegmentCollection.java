package com.applovin.mediation;

import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface MaxSegmentCollection {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Builder {
        Builder addSegment(MaxSegment maxSegment);

        MaxSegmentCollection build();
    }

    List<MaxSegment> getSegments();
}
