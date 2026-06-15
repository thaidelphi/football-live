package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd extends Fragment implements LifecycleFragment {

    /* renamed from: e0  reason: collision with root package name */
    private static final WeakHashMap f12400e0 = new WeakHashMap();

    /* renamed from: b0  reason: collision with root package name */
    private final Map f12401b0 = Collections.synchronizedMap(new androidx.collection.a());

    /* renamed from: c0  reason: collision with root package name */
    private int f12402c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    private Bundle f12403d0;

    public static zzd Y1(FragmentActivity fragmentActivity) {
        zzd zzdVar;
        WeakHashMap weakHashMap = f12400e0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference == null || (zzdVar = (zzd) weakReference.get()) == null) {
            try {
                zzd zzdVar2 = (zzd) fragmentActivity.getSupportFragmentManager().i0("SupportLifecycleFragmentImpl");
                if (zzdVar2 == null || zzdVar2.j0()) {
                    zzdVar2 = new zzd();
                    fragmentActivity.getSupportFragmentManager().m().d(zzdVar2, "SupportLifecycleFragmentImpl").g();
                }
                weakHashMap.put(fragmentActivity, new WeakReference(zzdVar2));
                return zzdVar2;
            } catch (ClassCastException e8) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
            }
        }
        return zzdVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void A0() {
        super.A0();
        this.f12402c0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Q0() {
        super.Q0();
        this.f12402c0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void R0(Bundle bundle) {
        super.R0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f12401b0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void S0() {
        super.S0();
        this.f12402c0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void T0() {
        super.T0();
        this.f12402c0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f12401b0.containsKey(str)) {
            this.f12401b0.put(str, lifecycleCallback);
            if (this.f12402c0 > 0) {
                new zzi(Looper.getMainLooper()).post(new t0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return cls.cast(this.f12401b0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ Activity c() {
        return i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void q0(int i10, int i11, Intent intent) {
        super.q0(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f12401b0.values()) {
            lifecycleCallback.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        this.f12402c0 = 1;
        this.f12403d0 = bundle;
        for (Map.Entry entry : this.f12401b0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }
}
