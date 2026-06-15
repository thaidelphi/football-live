package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final k1 f18004a = new k1();

    private k1() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e8) {
            o9.d().a(e8);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public static final MeasurementManager a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            if (a() >= 4) {
                try {
                } catch (Exception unused) {
                    return null;
                }
            }
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    public static /* synthetic */ void b() {
    }
}
