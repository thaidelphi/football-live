package i4;

import a5.p0;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: ProgramInformation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f26559a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26560b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26561c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26562d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26563e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f26559a = str;
        this.f26560b = str2;
        this.f26561c = str3;
        this.f26562d = str4;
        this.f26563e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return p0.c(this.f26559a, hVar.f26559a) && p0.c(this.f26560b, hVar.f26560b) && p0.c(this.f26561c, hVar.f26561c) && p0.c(this.f26562d, hVar.f26562d) && p0.c(this.f26563e, hVar.f26563e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26559a;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26560b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26561c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26562d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26563e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
