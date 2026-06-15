package p3;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ByteBuffer;
import n3.m1;
/* compiled from: Ac4Util.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29573a = {2002, 2000, 1920, IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, com.ironsource.mediationsdk.metadata.a.f18931n};

    /* compiled from: Ac4Util.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29574a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29575b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29576c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29577d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29578e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f29574a = i10;
            this.f29576c = i11;
            this.f29575b = i12;
            this.f29577d = i13;
            this.f29578e = i14;
        }
    }

    public static void a(int i10, a5.c0 c0Var) {
        c0Var.G(7);
        byte[] d10 = c0Var.d();
        d10[0] = -84;
        d10[1] = 64;
        d10[2] = -1;
        d10[3] = -1;
        d10[4] = (byte) ((i10 >> 16) & 255);
        d10[5] = (byte) ((i10 >> 8) & 255);
        d10[6] = (byte) (i10 & 255);
    }

    public static m1 b(a5.c0 c0Var, String str, String str2, DrmInitData drmInitData) {
        c0Var.L(1);
        return new m1.b().S(str).e0("audio/ac4").H(2).f0(((c0Var.z() & 32) >> 5) == 1 ? 48000 : 44100).M(drmInitData).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new a5.b0(bArr)).f29578e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r10 != 8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p3.c.b d(a5.b0 r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L45
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L45
            r10.q(r0)
        L45:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = p3.c.f29573a
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = p3.c.f29573a
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8a
            r8 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
            goto L89
        L85:
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
        L89:
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r6) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            p3.c$b r10 = new p3.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.d(a5.b0):p3.c$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int f(a5.b0 b0Var, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + b0Var.h(i10);
            if (!b0Var.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
