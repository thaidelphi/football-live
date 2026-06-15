package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f2684a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Object obj) {
        this.f2684a = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f2684a.equals(((k) obj).getLocaleList());
    }

    @Override // androidx.core.os.k
    public Locale get(int i10) {
        return this.f2684a.get(i10);
    }

    @Override // androidx.core.os.k
    public Object getLocaleList() {
        return this.f2684a;
    }

    public int hashCode() {
        return this.f2684a.hashCode();
    }

    public String toString() {
        return this.f2684a.toString();
    }
}
