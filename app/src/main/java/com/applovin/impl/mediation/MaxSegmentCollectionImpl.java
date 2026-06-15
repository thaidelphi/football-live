package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxSegmentCollectionImpl implements MaxSegmentCollection {

    /* renamed from: a  reason: collision with root package name */
    private final List f7562a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7563b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a  reason: collision with root package name */
        private final List f7564a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f7564a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f7563b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f7562a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f7562a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f7564a;
        this.f7562a = list;
        this.f7563b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f7563b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
