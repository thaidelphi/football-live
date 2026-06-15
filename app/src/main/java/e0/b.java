package e0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.m;
/* compiled from: EmojiEditableFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f24813a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f24814b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f24815c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f24815c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f24814b == null) {
            synchronized (f24813a) {
                if (f24814b == null) {
                    f24814b = new b();
                }
            }
        }
        return f24814b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f24815c;
        if (cls != null) {
            return m.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
