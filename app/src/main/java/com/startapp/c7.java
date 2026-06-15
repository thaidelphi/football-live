package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c7 extends f7 {

    /* renamed from: c  reason: collision with root package name */
    public a f21843c;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h7 f21844a;

        public a(h7 h7Var) {
            this.f21844a = h7Var;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            this.f21844a.a(new Pair(c7.this, intent));
        }
    }

    public c7(HashMap hashMap, String str) {
        super(hashMap, str);
    }

    @Override // com.startapp.k7
    public final void a(Context context, h7 h7Var) throws Exception {
        if (this.f21843c == null) {
            a aVar = new a(h7Var);
            this.f21843c = aVar;
            context.registerReceiver(aVar, new IntentFilter(this.f21949a));
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c7.class != obj.getClass()) {
            return false;
        }
        return o9.a(this.f21843c, ((c7) obj).f21843c);
    }

    public final int hashCode() {
        Object[] objArr = {this.f21843c};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    @Override // com.startapp.k7
    public final void a(Context context) throws Exception {
        a aVar = this.f21843c;
        if (aVar != null) {
            context.unregisterReceiver(aVar);
            this.f21843c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
