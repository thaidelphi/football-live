package com.google.android.gms.common;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l extends m {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f12642f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l(Callable callable, zzu zzuVar) {
        super();
        this.f12642f = callable;
    }

    @Override // com.google.android.gms.common.m
    final String a() {
        try {
            return (String) this.f12642f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
