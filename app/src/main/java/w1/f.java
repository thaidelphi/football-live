package w1;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: Key.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f31964a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
