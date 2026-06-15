package r9;

import com.ironsource.in;
/* compiled from: HttpMethod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f {
    public static boolean a(String str) {
        return str.equals(in.f17849b) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return (str.equals(in.f17848a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean c(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean e(String str) {
        return str.equals(in.f17849b) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
