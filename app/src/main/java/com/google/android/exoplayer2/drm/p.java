package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.q1;
/* compiled from: ExoMediaDrm.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface p {

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f10535a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10536b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10537c;

        public a(byte[] bArr, String str, int i10) {
            this.f10535a = bArr;
            this.f10536b = str;
            this.f10537c = i10;
        }

        public byte[] a() {
            return this.f10535a;
        }

        public String b() {
            return this.f10536b;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(p pVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        p a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f10538a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10539b;

        public d(byte[] bArr, String str) {
            this.f10538a = bArr;
            this.f10539b = str;
        }

        public byte[] a() {
            return this.f10538a;
        }

        public String b() {
            return this.f10539b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(b bVar);

    void f(byte[] bArr) throws DeniedByServerException;

    int g();

    q3.b h(byte[] bArr) throws MediaCryptoException;

    boolean i(byte[] bArr, String str);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void l(byte[] bArr, q1 q1Var);

    a m(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    void release();
}
