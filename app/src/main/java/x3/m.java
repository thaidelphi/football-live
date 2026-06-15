package x3;

import android.media.MediaCodec;
/* compiled from: MediaCodecDecoderException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m extends q3.f {

    /* renamed from: a  reason: collision with root package name */
    public final n f32487a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32488b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.Throwable r4, x3.n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f32489a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f32487a = r5
            int r5 = a5.p0.f482a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = a(r4)
        L27:
            r3.f32488b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.<init>(java.lang.Throwable, x3.n):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
