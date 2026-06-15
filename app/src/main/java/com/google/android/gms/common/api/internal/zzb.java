package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb extends Fragment implements LifecycleFragment {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f12396d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f12397a = Collections.synchronizedMap(new androidx.collection.a());

    /* renamed from: b  reason: collision with root package name */
    private int f12398b = 0;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f12399c;

    public static zzb f(Activity activity) {
        zzb zzbVar;
        WeakHashMap weakHashMap = f12396d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference == null || (zzbVar = (zzb) weakReference.get()) == null) {
            try {
                zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zzbVar2 == null || zzbVar2.isRemoving()) {
                    zzbVar2 = new zzb();
                    activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(zzbVar2));
                return zzbVar2;
            } catch (ClassCastException e8) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
            }
        }
        return zzbVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f12397a.containsKey(str)) {
            this.f12397a.put(str, lifecycleCallback);
            if (this.f12398b > 0) {
                new zzi(Looper.getMainLooper()).post(new s0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return cls.cast(this.f12397a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12398b = 1;
        this.f12399c = bundle;
        for (Map.Entry entry : this.f12397a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f12398b = 5;
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f12398b = 3;
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f12397a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f12398b = 2;
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f12398b = 4;
        for (LifecycleCallback lifecycleCallback : this.f12397a.values()) {
            lifecycleCallback.onStop();
        }
    }
}
