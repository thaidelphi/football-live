package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WaterfallConfiguration {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f18506a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f18507b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        public final WaterfallConfiguration empty() {
            return builder().build();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class WaterfallConfigurationBuilder {

        /* renamed from: a  reason: collision with root package name */
        private Double f18508a;

        /* renamed from: b  reason: collision with root package name */
        private Double f18509b;

        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, null);
        }

        public final Double getCeiling$mediationsdk_release() {
            return this.f18509b;
        }

        public final Double getFloor$mediationsdk_release() {
            return this.f18508a;
        }

        public final WaterfallConfigurationBuilder setCeiling(double d10) {
            this.f18509b = Double.valueOf(d10);
            return this;
        }

        public final void setCeiling$mediationsdk_release(Double d10) {
            this.f18509b = d10;
        }

        public final WaterfallConfigurationBuilder setFloor(double d10) {
            this.f18508a = Double.valueOf(d10);
            return this;
        }

        public final void setFloor$mediationsdk_release(Double d10) {
            this.f18508a = d10;
        }
    }

    private WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder) {
        this.f18506a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.f18507b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    public /* synthetic */ WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, kotlin.jvm.internal.h hVar) {
        this(waterfallConfigurationBuilder);
    }

    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    public final Double getCeiling() {
        return this.f18507b;
    }

    public final Double getFloor() {
        return this.f18506a;
    }

    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f18507b);
            jSONObject.put("floor", this.f18506a);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.n.e(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }
}
