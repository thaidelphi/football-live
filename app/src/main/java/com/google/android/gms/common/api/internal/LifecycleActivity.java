package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class LifecycleActivity {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12130a;

    public LifecycleActivity(Activity activity) {
        Preconditions.n(activity, "Activity must not be null");
        this.f12130a = activity;
    }

    public final Activity a() {
        return (Activity) this.f12130a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f12130a;
    }

    public final boolean c() {
        return this.f12130a instanceof Activity;
    }

    public final boolean d() {
        return this.f12130a instanceof FragmentActivity;
    }
}
