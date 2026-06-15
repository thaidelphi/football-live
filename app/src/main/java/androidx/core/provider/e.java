package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.i;
import java.util.List;
/* compiled from: FontRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2700a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2701b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2702c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f2703d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2704e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2705f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2700a = (String) i.f(str);
        this.f2701b = (String) i.f(str2);
        this.f2702c = (String) i.f(str3);
        this.f2703d = (List) i.f(list);
        this.f2705f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f2703d;
    }

    public int c() {
        return this.f2704e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f2705f;
    }

    public String e() {
        return this.f2700a;
    }

    public String f() {
        return this.f2701b;
    }

    public String g() {
        return this.f2702c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2700a + ", mProviderPackage: " + this.f2701b + ", mQuery: " + this.f2702c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f2703d.size(); i10++) {
            sb.append(" [");
            List<byte[]> list = this.f2703d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2704e);
        return sb.toString();
    }
}
