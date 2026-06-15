package androidx.work;

import java.util.List;
/* compiled from: InputMerger.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4806a = p.f("InputMerger");

    public static l a(String str) {
        try {
            return (l) Class.forName(str).newInstance();
        } catch (Exception e8) {
            p c10 = p.c();
            String str2 = f4806a;
            c10.b(str2, "Trouble instantiating + " + str, e8);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
