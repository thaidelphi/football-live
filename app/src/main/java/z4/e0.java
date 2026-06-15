package z4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: HttpDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e0 extends c0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f33485d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33486e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, List<String>> f33487f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f33488g;

    public e0(int i10, String str, IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
        super("Response code: " + i10, iOException, pVar, 2004, 1);
        this.f33485d = i10;
        this.f33486e = str;
        this.f33487f = map;
        this.f33488g = bArr;
    }
}
