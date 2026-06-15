package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ListenerHolders {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ListenerHolder<?>> f12136a = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    public static <L> ListenerHolder<L> a(L l10, Looper looper, String str) {
        Preconditions.n(l10, "Listener must not be null");
        Preconditions.n(looper, "Looper must not be null");
        Preconditions.n(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l10, str);
    }

    public final void b() {
        for (ListenerHolder<?> listenerHolder : this.f12136a) {
            listenerHolder.a();
        }
        this.f12136a.clear();
    }
}
