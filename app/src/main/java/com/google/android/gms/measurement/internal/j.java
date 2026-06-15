package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class j implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f13019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzau f13020b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(zzau zzauVar) {
        Bundle bundle;
        this.f13020b = zzauVar;
        bundle = zzauVar.f13311a;
        this.f13019a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f13019a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13019a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
