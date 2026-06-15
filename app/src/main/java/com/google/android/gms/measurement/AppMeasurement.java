package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzie;
import com.ironsource.b9;
import com.ironsource.cc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f12820b;

    /* renamed from: a  reason: collision with root package name */
    private final c f12821a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mAppId;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mName;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mOrigin;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mTriggerEventName;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        ConditionalUserProperty(Bundle bundle) {
            Preconditions.m(bundle);
            this.mAppId = (String) zzgu.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzgu.a(bundle, cc.f16874p, String.class, null);
            this.mName = (String) zzgu.a(bundle, "name", String.class, null);
            this.mValue = zzgu.a(bundle, b9.h.X, Object.class, null);
            this.mTriggerEventName = (String) zzgu.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) zzgu.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzgu.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) zzgu.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) zzgu.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) zzgu.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) zzgu.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzgu.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) zzgu.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) zzgu.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzgu.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzgu.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface EventInterceptor extends zzgy {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface OnEventListener extends zzgz {
    }

    public AppMeasurement(zzfy zzfyVar) {
        this.f12821a = new a(zzfyVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f12820b
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.f12820b     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r6] = r14     // Catch: java.lang.Throwable -> L56
            r3[r7] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzie r2 = (com.google.android.gms.measurement.internal.zzie) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f12820b = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzfy r14 = com.google.android.gms.measurement.internal.zzfy.C(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f12820b = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.f12820b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f12821a.zzp(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f12821a.e(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f12821a.zzr(str);
    }

    @Keep
    public long generateEventId() {
        return this.f12821a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f12821a.zzh();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b10 = this.f12821a.b(str, str2);
        ArrayList arrayList = new ArrayList(b10 == null ? 0 : b10.size());
        for (Bundle bundle : b10) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f12821a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f12821a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f12821a.zzk();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.f12821a.zza(str);
    }

    @VisibleForTesting
    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f12821a.c(str, str2, z10);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f12821a.a(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.m(conditionalUserProperty);
        c cVar = this.f12821a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(cc.f16874p, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzgu.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.d(bundle);
    }

    public AppMeasurement(zzie zzieVar) {
        this.f12821a = new b(zzieVar);
    }
}
