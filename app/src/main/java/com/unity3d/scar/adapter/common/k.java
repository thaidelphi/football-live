package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ScarAdapterBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class k implements f {

    /* renamed from: a  reason: collision with root package name */
    protected v7.c f23825a;

    /* renamed from: b  reason: collision with root package name */
    protected Map<String, u7.a> f23826b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    protected u7.a f23827c;

    /* renamed from: d  reason: collision with root package name */
    protected d<m> f23828d;

    /* compiled from: ScarAdapterBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f23829a;

        a(Activity activity) {
            this.f23829a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f23827c.a(this.f23829a);
        }
    }

    public k(d<m> dVar) {
        this.f23828d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, List<u7.d> list, v7.b bVar) {
        this.f23825a.a(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, String str, u7.d dVar, v7.b bVar) {
        this.f23825a.b(context, str, dVar, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Context context, boolean z10, v7.b bVar) {
        this.f23825a.c(context, z10, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void e(Activity activity, String str, String str2) {
        u7.a aVar = this.f23826b.get(str2);
        if (aVar == null) {
            d<m> dVar = this.f23828d;
            dVar.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f23827c = aVar;
        l.a(new a(activity));
    }
}
