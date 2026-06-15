package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f14778b;

    /* renamed from: a  reason: collision with root package name */
    private final zzee f14779a;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.m(zzeeVar);
        this.f14779a = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f14778b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f14778b == null) {
                    f14778b = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return f14778b;
    }

    @Keep
    public static zzie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f14779a.zzG(activity, str, str2);
    }
}
