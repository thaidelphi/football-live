package r9;

import java.net.Proxy;
import n9.s;
import n9.y;
/* compiled from: RequestLine.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i {
    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.g());
        sb.append(' ');
        if (b(yVar, type)) {
            sb.append(yVar.i());
        } else {
            sb.append(c(yVar.i()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.f() && type == Proxy.Type.HTTP;
    }

    public static String c(s sVar) {
        String g10 = sVar.g();
        String i10 = sVar.i();
        if (i10 != null) {
            return g10 + '?' + i10;
        }
        return g10;
    }
}
