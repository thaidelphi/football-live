package n3;

import java.util.HashSet;
/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f28095a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f28096b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (j1.class) {
            if (f28095a.add(str)) {
                f28096b += ", " + str;
            }
        }
    }
}
