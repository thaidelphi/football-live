package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SuppressLint({"HandlerLeak"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends zaq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GoogleApiAvailability f12041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f12041b = googleApiAvailability;
        this.f12040a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i11 = this.f12041b.i(this.f12040a);
        if (this.f12041b.m(i11)) {
            this.f12041b.s(this.f12040a, i11);
        }
    }
}
