package com.startapp;

import com.startapp.eb;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class db implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eb.a f21895a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ eb f21896b;

    public db(eb ebVar, eb.a aVar) {
        this.f21896b = ebVar;
        this.f21895a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21895a.onUpdate(eb.a(this.f21896b))) {
            this.f21896b.f21916a.postDelayed(this, 100L);
        }
    }
}
