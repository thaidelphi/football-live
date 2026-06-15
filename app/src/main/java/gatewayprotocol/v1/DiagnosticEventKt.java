package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: DiagnosticEventKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* compiled from: DiagnosticEventKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* compiled from: DiagnosticEventKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: DiagnosticEventKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* compiled from: DiagnosticEventKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            n.f(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            n.f(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            n.e(adType, "_builder.getAdType()");
            return adType;
        }

        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            n.e(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            n.e(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            n.e(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            n.e(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            n.e(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            n.e(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            n.f(dslMap, "<this>");
            n.f(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            n.f(dslMap, "<this>");
            n.f(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            this._builder.putIntTags(key, i10);
        }

        public final void putStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            this._builder.putStringTags(key, value);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String key) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            this._builder.removeIntTags(key);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String key) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            this._builder.removeStringTags(key);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType value) {
            n.f(value, "value");
            this._builder.setAdType(value);
        }

        public final void setCustomEventType(String value) {
            n.f(value, "value");
            this._builder.setCustomEventType(value);
        }

        public final void setEventId(int i10) {
            this._builder.setEventId(i10);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            n.f(value, "value");
            this._builder.setEventType(value);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            n.f(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            putIntTags(dslMap, key, i10);
        }

        public final void setIsHeaderBidding(boolean z10) {
            this._builder.setIsHeaderBidding(z10);
        }

        public final void setPlacementId(String value) {
            n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            putStringTags(dslMap, key, value);
        }

        public final void setTimeValue(double d10) {
            this._builder.setTimeValue(d10);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            n.f(value, "value");
            this._builder.setTimestamps(value);
        }
    }

    private DiagnosticEventKt() {
    }
}
