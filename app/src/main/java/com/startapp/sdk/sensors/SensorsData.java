package com.startapp.sdk.sensors;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SensorsData implements Serializable {
    private static final long serialVersionUID = -4441352330701662536L;
    private int collectionPeriodInSeconds;
    private boolean detailsString;
    private boolean enable;
    private int samplesPerBatch;
    private int totalBatchAmount;
    private int totalDailyBatchAmount;
    private int samplingFrequencyInHertz = 10;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final int a() {
        return this.collectionPeriodInSeconds;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final int c() {
        return this.samplesPerBatch;
    }

    public final int d() {
        int i10 = this.samplingFrequencyInHertz;
        if (i10 == 0) {
            return 10;
        }
        return i10;
    }

    public final int e() {
        return this.totalBatchAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SensorsData.class != obj.getClass()) {
            return false;
        }
        SensorsData sensorsData = (SensorsData) obj;
        return this.enable == sensorsData.enable && this.totalBatchAmount == sensorsData.totalBatchAmount && this.totalDailyBatchAmount == sensorsData.totalDailyBatchAmount && this.collectionPeriodInSeconds == sensorsData.collectionPeriodInSeconds && this.samplingFrequencyInHertz == sensorsData.samplingFrequencyInHertz && this.samplesPerBatch == sensorsData.samplesPerBatch && this.detailsString == sensorsData.detailsString && o9.a(this.infoEvents, sensorsData.infoEvents);
    }

    public final int f() {
        return this.totalDailyBatchAmount;
    }

    public final boolean g() {
        return this.detailsString;
    }

    public final boolean h() {
        return this.enable;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enable), Integer.valueOf(this.totalBatchAmount), Integer.valueOf(this.totalDailyBatchAmount), Integer.valueOf(this.collectionPeriodInSeconds), Integer.valueOf(this.samplingFrequencyInHertz), Integer.valueOf(this.samplesPerBatch), Boolean.valueOf(this.detailsString), this.infoEvents};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
