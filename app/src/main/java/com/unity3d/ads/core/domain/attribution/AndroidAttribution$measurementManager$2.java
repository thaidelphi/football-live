package com.unity3d.ads.core.domain.attribution;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.o;
import t8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAttribution.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidAttribution$measurementManager$2 extends o implements a<MeasurementManager> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AndroidAttribution this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAttribution$measurementManager$2(AndroidAttribution androidAttribution, Context context) {
        super(0);
        this.this$0 = androidAttribution;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final MeasurementManager invoke() {
        MeasurementManager measurementManager;
        measurementManager = this.this$0.getMeasurementManager(this.$context);
        return measurementManager;
    }
}
