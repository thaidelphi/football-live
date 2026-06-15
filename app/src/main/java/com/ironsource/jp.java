package com.ironsource;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class jp {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17976a;

    /* renamed from: b  reason: collision with root package name */
    private String f17977b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17978c;

    /* renamed from: d  reason: collision with root package name */
    private int f17979d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f17980e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f17981f;

    public jp() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public jp(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.n.f(pixelEventsUrl, "pixelEventsUrl");
        this.f17976a = z10;
        this.f17977b = pixelEventsUrl;
        this.f17978c = z11;
        this.f17979d = i10;
        this.f17980e = iArr;
        this.f17981f = iArr2;
    }

    public /* synthetic */ jp(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, kotlin.jvm.internal.h hVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? kp.f18105a : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? -1 : i10, (i11 & 16) != 0 ? null : iArr, (i11 & 32) != 0 ? null : iArr2);
    }

    public static /* synthetic */ jp a(jp jpVar, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = jpVar.f17976a;
        }
        if ((i11 & 2) != 0) {
            str = jpVar.f17977b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = jpVar.f17978c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            i10 = jpVar.f17979d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            iArr = jpVar.f17980e;
        }
        int[] iArr3 = iArr;
        if ((i11 & 32) != 0) {
            iArr2 = jpVar.f17981f;
        }
        return jpVar.a(z10, str2, z12, i12, iArr3, iArr2);
    }

    public final jp a(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.n.f(pixelEventsUrl, "pixelEventsUrl");
        return new jp(z10, pixelEventsUrl, z11, i10, iArr, iArr2);
    }

    public final void a(int i10) {
        this.f17979d = i10;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f17977b = str;
    }

    public final void a(boolean z10) {
        this.f17978c = z10;
    }

    public final void a(int[] iArr) {
        this.f17981f = iArr;
    }

    public final boolean a() {
        return this.f17976a;
    }

    public final String b() {
        return this.f17977b;
    }

    public final void b(boolean z10) {
        this.f17976a = z10;
    }

    public final void b(int[] iArr) {
        this.f17980e = iArr;
    }

    public final boolean c() {
        return this.f17978c;
    }

    public final int d() {
        return this.f17979d;
    }

    public final int[] e() {
        return this.f17980e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jp) {
            jp jpVar = (jp) obj;
            return this.f17976a == jpVar.f17976a && kotlin.jvm.internal.n.a(this.f17977b, jpVar.f17977b) && this.f17978c == jpVar.f17978c && this.f17979d == jpVar.f17979d && kotlin.jvm.internal.n.a(this.f17980e, jpVar.f17980e) && kotlin.jvm.internal.n.a(this.f17981f, jpVar.f17981f);
        }
        return false;
    }

    public final int[] f() {
        return this.f17981f;
    }

    public final boolean g() {
        return this.f17978c;
    }

    public final int h() {
        return this.f17979d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z10 = this.f17976a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + this.f17977b.hashCode()) * 31;
        boolean z11 = this.f17978c;
        int i10 = (((hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f17979d) * 31;
        int[] iArr = this.f17980e;
        int hashCode2 = (i10 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f17981f;
        return hashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f17976a;
    }

    public final String j() {
        return this.f17977b;
    }

    public final int[] k() {
        return this.f17981f;
    }

    public final int[] l() {
        return this.f17980e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f17976a + ", pixelEventsUrl=" + this.f17977b + ", pixelEventsCompression=" + this.f17978c + ", pixelEventsCompressionLevel=" + this.f17979d + ", pixelOptOut=" + Arrays.toString(this.f17980e) + ", pixelOptIn=" + Arrays.toString(this.f17981f) + ')';
    }
}
