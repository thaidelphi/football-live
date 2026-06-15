package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {

    /* renamed from: a  reason: collision with root package name */
    private final DataHolder f12105a;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public final void a(L l10) {
        c(l10, this.f12105a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @KeepForSdk
    public void b() {
        DataHolder dataHolder = this.f12105a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @KeepForSdk
    protected abstract void c(L l10, DataHolder dataHolder);
}
