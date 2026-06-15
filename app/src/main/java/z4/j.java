package z4;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;
import n3.h2;
/* compiled from: DataSchemeDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private p f33517e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f33518f;

    /* renamed from: g  reason: collision with root package name */
    private int f33519g;

    /* renamed from: h  reason: collision with root package name */
    private int f33520h;

    public j() {
        super(false);
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f33520h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(a5.p0.j(this.f33518f), this.f33519g, bArr, i10, min);
        this.f33519g += min;
        this.f33520h -= min;
        o(min);
        return min;
    }

    @Override // z4.l
    public void close() {
        if (this.f33518f != null) {
            this.f33518f = null;
            p();
        }
        this.f33517e = null;
    }

    @Override // z4.l
    public long l(p pVar) throws IOException {
        q(pVar);
        this.f33517e = pVar;
        Uri uri = pVar.f33569a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        a5.a.b(equals, "Unsupported scheme: " + scheme);
        String[] R0 = a5.p0.R0(uri.getSchemeSpecificPart(), ",");
        if (R0.length == 2) {
            String str = R0[1];
            if (R0[0].contains(";base64")) {
                try {
                    this.f33518f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e8) {
                    throw h2.b("Error while parsing Base64 encoded string: " + str, e8);
                }
            } else {
                this.f33518f = a5.p0.m0(URLDecoder.decode(str, x5.b.f32748a.name()));
            }
            long j10 = pVar.f33575g;
            byte[] bArr = this.f33518f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f33519g = i10;
                int length = bArr.length - i10;
                this.f33520h = length;
                long j11 = pVar.f33576h;
                if (j11 != -1) {
                    this.f33520h = (int) Math.min(length, j11);
                }
                r(pVar);
                long j12 = pVar.f33576h;
                return j12 != -1 ? j12 : this.f33520h;
            }
            this.f33518f = null;
            throw new m(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw h2.b("Unexpected URI format: " + uri, null);
    }

    @Override // z4.l
    public Uri m() {
        p pVar = this.f33517e;
        if (pVar != null) {
            return pVar.f33569a;
        }
        return null;
    }
}
