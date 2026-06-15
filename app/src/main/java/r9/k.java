package r9;

import java.io.IOException;
import java.net.ProtocolException;
import n9.w;
/* compiled from: StatusLine.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final w f30482a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30483b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30484c;

    public k(w wVar, int i10, String str) {
        this.f30482a = wVar;
        this.f30483b = i10;
        this.f30484c = str;
    }

    public static k a(String str) throws IOException {
        w wVar;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    wVar = w.HTTP_1_0;
                } else if (charAt == 1) {
                    wVar = w.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            wVar = w.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new k(wVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30482a == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f30483b);
        if (this.f30484c != null) {
            sb.append(' ');
            sb.append(this.f30484c);
        }
        return sb.toString();
    }
}
