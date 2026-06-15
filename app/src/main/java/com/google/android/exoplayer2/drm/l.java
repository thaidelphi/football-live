package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import n3.m1;
import o3.q1;
import r3.v;
/* compiled from: DrmSessionManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f10531a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final l f10532b;

    /* compiled from: DrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements l {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ void a() {
            r3.l.b(this);
        }

        @Override // com.google.android.exoplayer2.drm.l
        public j b(k.a aVar, m1 m1Var) {
            if (m1Var.f28188o == null) {
                return null;
            }
            return new o(new j.a(new v(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ b c(k.a aVar, m1 m1Var) {
            return r3.l.a(this, aVar, m1Var);
        }

        @Override // com.google.android.exoplayer2.drm.l
        public int d(m1 m1Var) {
            return m1Var.f28188o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.l
        public void e(Looper looper, q1 q1Var) {
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ void release() {
            r3.l.c(this);
        }
    }

    /* compiled from: DrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10533a = new b() { // from class: r3.m
            @Override // com.google.android.exoplayer2.drm.l.b
            public final void release() {
                n.a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f10531a = aVar;
        f10532b = aVar;
    }

    void a();

    j b(k.a aVar, m1 m1Var);

    b c(k.a aVar, m1 m1Var);

    int d(m1 m1Var);

    void e(Looper looper, q1 q1Var);

    void release();
}
