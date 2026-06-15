package com.google.android.exoplayer2.drm;

import a5.c0;
import a5.p0;
import a5.t;
import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.q1;
import r3.v;
/* compiled from: FrameworkMediaDrm.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final p.c f10540d = new p.c() { // from class: r3.s
        @Override // com.google.android.exoplayer2.drm.p.c
        public final com.google.android.exoplayer2.drm.p a(UUID uuid) {
            com.google.android.exoplayer2.drm.p A;
            A = com.google.android.exoplayer2.drm.q.A(uuid);
            return A;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final UUID f10541a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f10542b;

    /* renamed from: c  reason: collision with root package name */
    private int f10543c;

    /* compiled from: FrameworkMediaDrm.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, q1 q1Var) {
            LogSessionId a10 = q1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) a5.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
        }
    }

    private q(UUID uuid) throws UnsupportedSchemeException {
        a5.a.e(uuid);
        a5.a.b(!n3.i.f28005b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10541a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f10542b = mediaDrm;
        this.f10543c = 1;
        if (n3.i.f28007d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p A(UUID uuid) {
        try {
            return C(uuid);
        } catch (v unused) {
            t.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new n();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(p0.f485d);
    }

    public static q C(UUID uuid) throws v {
        try {
            return new q(uuid);
        } catch (UnsupportedSchemeException e8) {
            throw new v(1, e8);
        } catch (Exception e10) {
            throw new v(2, e10);
        }
    }

    private static byte[] p(byte[] bArr) {
        int indexOf;
        c0 c0Var = new c0(bArr);
        int p10 = c0Var.p();
        short q10 = c0Var.q();
        short q11 = c0Var.q();
        if (q10 == 1 && q11 == 1) {
            short q12 = c0Var.q();
            Charset charset = x5.b.f32752e;
            String x10 = c0Var.x(q12, charset);
            if (x10.contains("<LA_URL>")) {
                return bArr;
            }
            if (x10.indexOf("</DATA>") == -1) {
                t.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = x10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + x10.substring(indexOf);
            int i10 = p10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort(q10);
            allocate.putShort(q11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        t.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static String q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (p0.f482a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return n3.i.f28006c.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = n3.i.f28008e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = v3.g.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = v3.g.a(r0, r4)
        L18:
            int r1 = a5.p0.f482a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = n3.i.f28007d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = a5.p0.f484c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = a5.p0.f485d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = v3.g.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.q.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (p0.f482a < 26 && n3.i.f28006c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (p0.f482a >= 27 || !n3.i.f28006c.equals(uuid)) ? uuid : n3.i.f28005b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData y(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z10;
        if (!n3.i.f28007d.equals(uuid)) {
            return list.get(0);
        }
        if (p0.f482a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                DrmInitData.SchemeData schemeData2 = list.get(i11);
                byte[] bArr = (byte[]) a5.a.e(schemeData2.f10439e);
                if (!p0.c(schemeData2.f10438d, schemeData.f10438d) || !p0.c(schemeData2.f10437c, schemeData.f10437c) || !v3.g.c(bArr)) {
                    z10 = false;
                    break;
                }
                i10 += bArr.length;
            }
            z10 = true;
            if (z10) {
                byte[] bArr2 = new byte[i10];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) a5.a.e(list.get(i13).f10439e);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return schemeData.b(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            DrmInitData.SchemeData schemeData3 = list.get(i14);
            int g10 = v3.g.g((byte[]) a5.a.e(schemeData3.f10439e));
            int i15 = p0.f482a;
            if (i15 < 23 && g10 == 0) {
                return schemeData3;
            }
            if (i15 >= 23 && g10 == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(p.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public Map<String, String> a(byte[] bArr) {
        return this.f10542b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f10542b.getProvisionRequest();
        return new p.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] c() throws MediaDrmException {
        return this.f10542b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void d(byte[] bArr, byte[] bArr2) {
        this.f10542b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void e(final p.b bVar) {
        this.f10542b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: r3.r
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                com.google.android.exoplayer2.drm.q.this.z(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void f(byte[] bArr) throws DeniedByServerException {
        this.f10542b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public int g() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.p
    public boolean i(byte[] bArr, String str) {
        if (p0.f482a >= 31) {
            return a.a(this.f10542b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f10541a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void j(byte[] bArr) {
        this.f10542b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] k(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (n3.i.f28006c.equals(this.f10541a)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.f10542b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void l(byte[] bArr, q1 q1Var) {
        if (p0.f482a >= 31) {
            try {
                a.b(this.f10542b, bArr, q1Var);
            } catch (UnsupportedOperationException unused) {
                t.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    @SuppressLint({"WrongConstant"})
    public p.a m(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        DrmInitData.SchemeData schemeData = null;
        if (list != null) {
            schemeData = y(this.f10541a, list);
            bArr2 = s(this.f10541a, (byte[]) a5.a.e(schemeData.f10439e));
            str = t(this.f10541a, schemeData.f10438d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f10542b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f10541a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && schemeData != null && !TextUtils.isEmpty(schemeData.f10437c)) {
            q10 = schemeData.f10437c;
        }
        return new p.a(r10, q10, p0.f482a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public synchronized void release() {
        int i10 = this.f10543c - 1;
        this.f10543c = i10;
        if (i10 == 0) {
            this.f10542b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    /* renamed from: v */
    public r3.q h(byte[] bArr) throws MediaCryptoException {
        return new r3.q(u(this.f10541a), bArr, p0.f482a < 21 && n3.i.f28007d.equals(this.f10541a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f10542b.getPropertyString(str);
    }
}
