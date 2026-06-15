package h5;

import android.os.Build;
/* compiled from: CircularRevealHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f26220a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f26220a = 2;
        } else if (i10 >= 18) {
            f26220a = 1;
        } else {
            f26220a = 0;
        }
    }
}
